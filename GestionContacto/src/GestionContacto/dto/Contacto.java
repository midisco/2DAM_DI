/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionContacto.dto;

/**
 *
 * @author lenovo
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String dni;
    private String provincia;

    public Contacto(String nombre, String apellido, String dni, String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public String[] contactoArray(){
        String[] contactos = new String[4];
        contactos[0]=this.nombre;
        contactos[1]=this.apellido;
        contactos[2]=this.dni;
        contactos[3]=this.provincia;
        return contactos;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", provincia=" + provincia + '}';
    }
    
    
}
