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
public class Laboratorio {
    private int ID_laboratorio;
    private int ID_medicamento;
    private String Nombre;

    public Laboratorio(int ID_laboratorio, int ID_medicamento, String Nombre) {
        this.ID_laboratorio = ID_laboratorio;
        this.ID_medicamento = ID_medicamento;
        this.Nombre = Nombre;
    }

    public int getID_laboratorio() {
        return ID_laboratorio;
    }

    public void setID_laboratorio(int ID_laboratorio) {
        this.ID_laboratorio = ID_laboratorio;
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
