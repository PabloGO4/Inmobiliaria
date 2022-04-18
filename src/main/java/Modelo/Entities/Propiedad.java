package Modelo.Entities;

public class Propiedad {

    private int id;
    private int superficie;
    private String direccion;
    private int cp;
    private String ciudad;
    private String precio;
    private String descripcion;

    public Propiedad() {
    }

    public Propiedad(int superficie, String direccion, int cp, String ciudad, String precio, String descripcion) {
        this.superficie = superficie;
        this.direccion = direccion;
        this.cp = cp;
        this.ciudad = ciudad;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }


    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
