package com.jpeccia.ficha_ordem_paranormal_server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpeccia.ficha_ordem_paranormal_server.model.CharacterSheet.CharacterSheet;
import com.jpeccia.ficha_ordem_paranormal_server.model.InventoryItem.InventoryItem;
import com.jpeccia.ficha_ordem_paranormal_server.model.InventoryItem.DTO.InventoryItemDTO;
import com.jpeccia.ficha_ordem_paranormal_server.repository.InventoryItemRepository;

@Service
public class InventoryItemService {

    @Autowired
    private InventoryItemRepository inventoryItemRepository;

    public List<InventoryItemDTO> getInventoryItemsByCharacterSheetId(Long characterSheetId) {
        return inventoryItemRepository.findByCharacterSheetId(characterSheetId).stream()
                .map(item -> new InventoryItemDTO(
                        item.getId(),
                        item.getName(),
                        item.getType(),
                        item.getWeight()
                ))
                .toList();
    }

    public InventoryItemDTO addItemToInventory(Long characterSheetId, InventoryItemDTO itemDTO) {
        InventoryItem item = new InventoryItem();
        item.setName(itemDTO.name());
        item.setType(itemDTO.type());
        item.setWeight(itemDTO.weight());

        CharacterSheet characterSheet = new CharacterSheet();
        characterSheet.setId(characterSheetId);
        item.setCharacterSheet(characterSheet);

        InventoryItem savedItem = inventoryItemRepository.save(item);
        return new InventoryItemDTO(savedItem.getId(), savedItem.getName(), savedItem.getType(), savedItem.getWeight());
    }

    public void removeItemFromInventory(Long id) {
        inventoryItemRepository.deleteById(id);
    }
}
