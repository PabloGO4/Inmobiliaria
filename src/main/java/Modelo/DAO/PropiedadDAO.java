package Modelo.DAO;

import Modelo.Entities.Propiedad;
import Vista.Inputs;

public class PropiedadDAO implements Interface<Propiedad>{

    Conecxion connection = new Conecxion();
    Inputs vista = new Inputs();

    @Override
    public void mostrar(int id) {
        this.connection.connection();
        Propiedad p = connection.em.find(Propiedad.class, id);
        System.out.print("Id : " + p.getId() + "\n" +
                "Superficie : " + p.getSuperficie() + "\n" +
                "Dirección : " + p.getDireccion() + "\n" +
                "Cp : " + p.getCp() + "\n"+
                "Ciudad : " + p.getCiudad() + "\n"+
                "Precio : " + p.getPrecio() + "\n"+
                "Descripción : " + p.getDescripcion() + "\n");
        connection.Salir();
    }

    @Override
    public void create(Propiedad p) {
        this.connection.connection();
        try{
            connection.em.getTransaction().begin();
            connection.em.persist(p);
            connection.em.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Error al crear propiedad"+ ex.getMessage());
        }finally {
            this.connection.Salir();
        }
    }

    @Override
    public void update(int id) {
        this.connection.connection();
        connection.em.getTransaction().begin();
        Propiedad p = connection.em.find(Propiedad.class, id);
        p.setSuperficie(vista.num("#Superficie : "));
        p.setDireccion(vista.String("#Direccion : "));
        p.setCp(vista.num("#Cp : "));
        p.setCiudad(vista.String("#Ciudad : "));
        p.setPrecio(vista.String("#Precio : "));
        p.setDescripcion(vista.String("#Descripcion : "));
        connection.em.getTransaction().commit();
        this.connection.Salir();
    }

    @Override
    public void delete(int id) {
        this.connection.connection();
        try {
            connection.em.getTransaction().begin();
            Propiedad p = connection.em.find(Propiedad.class, id);
            connection.em.remove(p);
            connection.em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error al eliminar `propiedad" + e.getMessage());
        } finally {
            this.connection.Salir();
    }
}
}

