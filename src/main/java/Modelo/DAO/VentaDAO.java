package Modelo.DAO;

import Modelo.Entities.Propiedad;
import Modelo.Entities.Venta;
import Vista.Inputs;

public class VentaDAO implements Interface<Venta>{

    Conecxion connection = new Conecxion();
    Inputs vista = new Inputs();


    @Override
    public void mostrar(int id) {
        this.connection.connection();
        Venta v = connection.em.find(Venta.class, id);
        System.out.print("Id : " + v.getId() + "\n" +
                "dniTrabajador : " + v.getDniTrabajador() + "\n" +
                "dniPropietario : " + v.getDniPropietario() + "\n" +
                "dniCliente : " + v.getDniCliente() + "\n"+
                "fecha : " + v.getFecha() + "\n");
        connection.Salir();
    }

    @Override
    public void create(Venta v) {
        this.connection.connection();
        try{
            connection.em.getTransaction().begin();
            connection.em.persist(v);
            connection.em.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Error al crear venta"+ ex.getMessage());
        }finally {
            this.connection.Salir();
        }
    }

    @Override
    public void update(int id) {
        this.connection.connection();
        connection.em.getTransaction().begin();
        Venta v = connection.em.find(Venta.class, id);
        v.setDniTrabajador(vista.String("#DNITrabajador : "));
        v.setDniPropietario(vista.String("#DNIDireccion : "));
        v.setDniCliente(vista.String("#DNICliente : "));
        v.setFecha(vista.String("#Fecha : "));
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
            System.out.println("Error al elimnar venta" + e.getMessage());
        } finally {
            this.connection.Salir();
        }
    }
}
