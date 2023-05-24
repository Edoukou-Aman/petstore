package fr.sdv.b32223.bo;

import jakarta.persistence.*;

@Entity
public class Cat extends Animal {

    @Column(name = "chipId")
    private String chipId;

    public Cat() {
    }

    public Cat( String chipId ) {
        this.chipId = chipId;
    }

    public String getChipId() {
        return chipId;
    }

    public void setChipId( String chipId ) {
        this.chipId = chipId;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "chipId='" + chipId + '\'' +
                '}';
    }
}
