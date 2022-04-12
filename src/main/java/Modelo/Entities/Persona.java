package Modelo.Entities;

public class Persona {

    private int id;
    private String nombre;
    private String apellio1;
    private String apellido2;
    private String dni;
    private String email;
    private String direccion;
    private int telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellio1, String apellido2, String dni, String email, String direccion, int telefono) {
        this.nombre = nombre;
        this.apellio1 = apellio1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellio1() {
        return apellio1;
    }

    public void setApellio1(String apellio1) {
        this.apellio1 = apellio1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
