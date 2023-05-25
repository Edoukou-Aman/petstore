package fr.sdv.b32223;

import fr.sdv.b32223.bo.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Instanciation EntityManagerFactory & EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "petstore" );
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();

        // Insertion : 3 enregistrements dans chaque table
        // 1 - Adresse
        Address ajoutAdress = new Address("09", "Rue Vinci ", "98767", "Paris");
        em.persist(ajoutAdress);
        Address ajoutAdress2 = new Address("12", "Rue Yann ", "50090", "Lyon");
        em.persist(ajoutAdress2);
        Address ajoutAdress3 = new Address("09", "Rue Sup ", "45678", "Marseille");
        em.persist(ajoutAdress3);

        //  2 - Product
        Product ajoutProduct = new Product("1232","Canne", ProdType.ACESSORY, 12.0);
        em.persist(ajoutProduct);
        Product ajoutProduct1 = new Product("1672","Savon", ProdType.CLEANNG, 15.0);
        em.persist(ajoutProduct1);
        Product ajoutProduct2 = new Product("6092","Chicken", ProdType.FOOD, 19.0);
        em.persist(ajoutProduct2);

        // 3 - Animal
        Animal ajoutAnimal = new Animal(LocalDate.of(2022,05,19), "Green");
        em.persist(ajoutAnimal);
        Animal ajoutAnimal1 = new Animal(LocalDate.of(2020,01,27), "Blue");
        em.persist(ajoutAnimal1);
        Animal ajoutAnimal2 = new Animal(LocalDate.of(2022,11,7), "Yelloy");
        em.persist(ajoutAnimal2);

        // 4 - PetStore
        PetStore ajoutPetstore = new PetStore("Petstore1", "Manager1");
        em.persist(ajoutPetstore);

        // Extraire tous les animaux


        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}