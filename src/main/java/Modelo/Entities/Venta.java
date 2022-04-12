package Modelo.Entities;

public class Venta {

    private int id;
    private String dniTrabajador;
    private String dniPropietario;
    private String dniCliente;
    private String fecha;

    public Venta() {
    }

    public Venta(String dniTrabajador, String dniPropietario, String dniCliente, String fecha) {
        this.dniTrabajador = dniTrabajador;
        this.dniPropietario = dniPropietario;
        this.dniCliente = dniCliente;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public String getDniTrabajador() {
        return dniTrabajador;
    }

    public void setDniTrabajador(String dniTrabajador) {
        this.dniTrabajador = dniTrabajador;
    }

    public String getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
