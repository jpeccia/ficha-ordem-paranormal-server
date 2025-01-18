package com.jpeccia.ficha_ordem_paranormal_server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpeccia.ficha_ordem_paranormal_server.model.InventoryItem.InventoryItem;

@Repository
public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> {
    List<InventoryItem> findByCharacterSheetId(Long characterSheetId);
}
