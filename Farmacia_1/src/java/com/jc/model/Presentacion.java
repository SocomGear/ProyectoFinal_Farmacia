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
public class Presentacion {
    private int ID_presentacion;
    private int ID_medicamento  ;          
    private String Nombre;

    public Presentacion(int ID_presentacion, int ID_medicamento, String Nombre) {
        this.ID_presentacion = ID_presentacion;
        this.ID_medicamento = ID_medicamento;
        this.Nombre = Nombre;
    }

    public int getID_presentacion() {
        return ID_presentacion;
    }

    public void setID_presentacion(int ID_presentacion) {
        this.ID_presentacion = ID_presentacion;
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
