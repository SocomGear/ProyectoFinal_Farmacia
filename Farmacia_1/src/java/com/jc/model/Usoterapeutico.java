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
public class Usoterapeutico {
    private int ID_terapeutico;
            private int ID_medicamento;
            private String Nombre;

    public Usoterapeutico(int ID_terapeutico, int ID_medicamento, String Nombre) {
        this.ID_terapeutico = ID_terapeutico;
        this.ID_medicamento = ID_medicamento;
        this.Nombre = Nombre;
    }

    public int getID_terapeutico() {
        return ID_terapeutico;
    }

    public void setID_terapeutico(int ID_terapeutico) {
        this.ID_terapeutico = ID_terapeutico;
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
