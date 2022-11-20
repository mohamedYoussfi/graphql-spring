package org.sid.inventoryservice.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
