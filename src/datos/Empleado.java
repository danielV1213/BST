/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import bst.Base;

/**
 *
 * @author Daniel
 */
public class Empleado implements Comparable<Empleado> {

    private int id;

    private String nombre;  

    private String puesto;

    private String despacho;

    public Empleado(int id, String nombre, String puesto, String despacho) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.despacho = despacho;
    }

    /**
     * Get the value of despacho
     *
     * @return the value of despacho
     */
    public String getDespacho() {
        return despacho;
    }

    /**
     * Set the value of despacho
     *
     * @param despacho new value of despacho
     */
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    /**
     * Get the value of puesto
     *
     * @return the value of puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Set the value of puesto
     *
     * @param puesto new value of puesto
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Datos: " + "id: " + id + ", nombre: " + nombre + ", puesto: " + puesto + ", despacho: " + despacho;
    }

    @Override
    public int compareTo(Empleado empl) {
        if (id == empl.id) {
            return 0;
        } else if (id < empl.id) {
            return -1;
        } else {
            return 1;
        }
    }

}
