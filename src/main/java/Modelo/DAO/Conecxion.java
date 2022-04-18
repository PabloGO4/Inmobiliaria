package Modelo.DAO;
import Modelo.Entities.*;
import Vista.Menu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conecxion {

    EntityManagerFactory emf;
    EntityManager em;
    public void connection(){
        emf = Persistence.createEntityManagerFactory("default");
        em = emf.createEntityManager();
    }
    public void Salir (){
        em.close();
        emf.close();

    }

}
