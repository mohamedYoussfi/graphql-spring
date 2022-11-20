package org.sid.inventoryservice.repository;

import org.sid.inventoryservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
