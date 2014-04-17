/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;

/**
 *
 * @author Deyanira
 */
public class Concentracion {
    private int ID_concentracion;
    private int ID_medicamento;
    private String Nombre        ;

    public Concentracion(int ID_concentracion, int ID_medicamento, String Nombre) {
        this.ID_concentracion = ID_concentracion;
        this.ID_medicamento = ID_medicamento;
        this.Nombre = Nombre;
    }

    public int getID_concentracion() {
        return ID_concentracion;
    }

    public void setID_concentracion(int ID_concentracion) {
        this.ID_concentracion = ID_concentracion;
    }

    public int getID_medicamento() {
        return ID_medicamento;
    }

    public void setID_medicamento(int ID_medicamento) {
        this.ID_medicamento = ID_medicamento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
