package org.example.petstore.repository;

import org.example.petstore.models.Animal;
import org.example.petstore.models.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PetStoreRepository extends JpaRepository<PetStore, Long> {

    @Query("SELECT p.animals FROM PetStore p WHERE p.id = :petStoreId")
    List<Animal> findAnimalsByPetStoreId(Long petStoreId);
}
