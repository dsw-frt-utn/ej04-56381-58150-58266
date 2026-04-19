/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author valentin
 */
public class Marca {
    
    private String nombre;
    private String pais_origen;

    public Marca(String nombre, String pais_origen) {
        this.nombre = nombre;
        this.pais_origen = pais_origen;
    }

    @Override
    public String toString() {
        return "Marca{" + "nombre=" + nombre + ", pais_origen=" + pais_origen + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }
    
    
    
}
