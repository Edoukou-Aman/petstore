package fr.sdv.b32223;

import fr.sdv.b32223.bo.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class Main {
    public static void main(String[] args) {

        // Instanciation EntityManagerFactory & EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "petstore" );
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();

        // Création / Insertion / Ajout : 3 enregistrements dans chaque table
        // 1 - Adresse
        Address ajoutAdress = new Address("09", "Rue Vinci ", "98767", "Paris");
        em.persist(ajoutAdress);
        Address ajoutAdress2 = new Address("12", "Rue Yann ", "50090", "Lyon");
        em.persist(ajoutAdress2);
        Address ajoutAdress3 = new Address("09", "Rue Sup ", "45678", "Marseille");
        em.persist(ajoutAdress3);

        // 2 - Product


        // Lecture / Sélection
        // 1 - Sélection simple par id



        // 2 - Sélection toutes les adresses


        // Extraire tous les animaux


        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}