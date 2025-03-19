package org.example.petstore.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String managername;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Animal> animals;

    @ManyToMany
    @JoinTable(
            name = "petstore_product",
            joinColumns = @JoinColumn(name = "petstore_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;



}
