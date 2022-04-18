package Modelo.DAO.JPSQL;

import javax.persistence.Query;
import java.util.List;
import Modelo.DAO.Conecxion;
import Modelo.Entities.Propiedad;

public class Consultas {

        Conecxion connection = new Conecxion();

    public void consulta1() {
        this.connection.connection();
        int idrecinto = 0; //Parametro que se pediría por teclado
        Query q = connection.em.createQuery("select p from Propiedad p where p.recintoIdRecinto.idRecinto = :id");
        List<Propiedad> animales = q.setParameter("id", idrecinto).getResultList();
        for (Propiedad a : animales) {

            System.out.println("Direccion: " + a.getDireccion());
        }
        this.connection.Salir();
    }
    public void consulta2(){
        this.connection.connection();
        //Query 2 Animales en un espectaculo
        int idespectaculo = 0; //Parametro que se pediría por teclado
        q = em.createQuery("select e from Espectáculo e where e.idEspectáculo = :id");
        Espectáculo espectaculo = (Espectáculo) q.setParameter("id", idespectaculo).getSingleResult();
        animales = espectaculo.getAnimales();
        for (Animales a : animales){

            System.out.println("Nombre: " + a.getNombre());

        }
        this.connection.Salir();

    }
    public void consulta3(){
        this.connection.connection();
        //Query 3 Animales por Tipo
        String tipo = "";
        q = em.createQuery("select v from Vertebrados v where v.tipoVertebrado = :tipo");
        List<Vertebrados> vertebrados = q.setParameter("tipo",tipo).getResultList();
        for(Vertebrados v : vertebrados){

            System.out.println("Nombre: " + v.getNombre());

        }
        q = em.createQuery("select i from Invertebrados i where i.tipoInvertebrado = :tipo");
        List<Invertebrados> invertebrados = q.setParameter("tipo",tipo).getResultList();
        for(Invertebrados i : invertebrados){

            System.out.println("Nombre: " + i.getNombre());

        }
        this.connection.Salir();

    }
    public void consulta4(){
        this.connection.connection();
        //Query 4 Animales por Especie
        String especie = "";
        q = em.createQuery("select v from Vertebrados v where v.especie = :especie");
        vertebrados = q.setParameter("especie",especie).getResultList();
        for(Vertebrados v : vertebrados){

            System.out.println("Nombre: " + v.getNombre());

        }
        q = em.createQuery("select i from Invertebrados i where i.especie = :especie");
        invertebrados = q.setParameter("especie",especie).getResultList();
        for(Invertebrados i : invertebrados){

            System.out.println("Nombre: " + i.getNombre());

        }
        this.connection.Salir();
    }
    public void consulta5(){
        this.connection.connection();
//Query 5 Visitante en un espectaculo
        idespectaculo = 0; //Parametro que se pediría por teclado
        q = em.createQuery("select e from Espectáculo e where e.idEspectáculo = :id");
        espectaculo = (Espectáculo) q.setParameter("id", idespectaculo).getSingleResult();
        List<Visitante> visitantes= espectaculo.getVisitantes();
        for (Visitante v : visitantes) {

            System.out.println("Nombre: " + v.getNombre());
        }
        this.connection.Salir();
    }
}
