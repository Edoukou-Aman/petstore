package fr.sdv.b32223;

import fr.sdv.b32223.bo.Address;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class Main {
    public static void main(String[] args) {

        // Instanciation EntityManagerFactory & EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "petstore" );
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();
        // Lecture / Sélection
        // 1 - Sélection simple par id
        Address address = em.find( Address.class, 1 );
        if ( address != null ) {
            System.out.println( address );
        }

        // 2 - Sélection toutes les adresses


        // Création / Insertion / Ajout


        // Extraire tous les animaux


        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}