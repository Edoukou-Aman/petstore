package fr.sdv.b32223.bo;

import jakarta.persistence.*;

@Entity
public class Fish extends Animal {

    @Enumerated( EnumType.STRING )
    private FishLivEnv livingEnv;

    public Fish() {
    }

    public Fish( FishLivEnv livingEnv ) {
        this.livingEnv = livingEnv;
    }

    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    public void setLivingEnv( FishLivEnv livingEnv ) {
        this.livingEnv = livingEnv;
    }
}
