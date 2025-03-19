package org.example.petstore.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.example.petstore.enums.FishLivEnv;

@Entity
public class Fish extends Animal {
    @Enumerated(EnumType.STRING)
    private FishLivEnv livingEnv;

    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }
    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }
}
