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
public class Nombrecomercial {
    private int ID_comercial;
    private int ID_medicamento;
    private String Nombre;

    public Nombrecomercial(int ID_comercial, int ID_medicamento, String Nombre) {
        this.ID_comercial = ID_comercial;
        this.ID_medicamento = ID_medicamento;
        this.Nombre = Nombre;
    }

    public int getID_comercial() {
        return ID_comercial;
    }

    public void setID_comercial(int ID_comercial) {
        this.ID_comercial = ID_comercial;
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
