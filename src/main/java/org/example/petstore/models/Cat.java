package org.example.petstore.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cat extends Animal {

    private String chipid;

    public String getChipid() {
        return chipid;
    }
    public void setChipid(String chipid) {
        this.chipid = chipid;
    }
}
