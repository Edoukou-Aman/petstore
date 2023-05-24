package fr.sdv.b32223.bo;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number")
    private String number;
    @Column(name = "street")
    private String street;
    @Column(name = "zipCode")
    private String zipCode;
    @Column(name = "city")
    private String city;

    @OneToOne(mappedBy = "address")
    private PetStore petStore;


    // Constructeur vide
    public Address() {}

    // Constructeur complet
    public Address(Long id, String number, String street, String zipCode, String city) {
        this.number = number;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }

    //To string
    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
