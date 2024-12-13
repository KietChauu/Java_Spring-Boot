package com.vanlang.webbanhang.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="products")
public class Product {

    @Id // This annotation marks the primary key field
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Depending on your database, adjust the strategy
    private Long id;

    private String name;
    private double price;
    private String description;

    @ManyToOne // Assuming Category is another entity and you want to define a Many-to-One relationship
    private Category category;

    // Constructors and other methods can remain as they are

}
