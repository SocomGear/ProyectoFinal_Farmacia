/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;
import java.sql.Date;

/**
 *
 * @author Deyanira
 */
public class Medicamento {
    private  int ID_medicamento;
            private String composicion_quimica;
            private long fecha_vecimiento;
            private float precio;

    public Medicamento(int ID_medicamento, String composicion_quimica, long fecha_vecimiento, float precio) {
        this.ID_medicamento = ID_medicamento;
        this.composicion_quimica = composicion_quimica;
        this.fecha_vecimiento = fecha_vecimiento;
        this.precio = precio;
    }


    public int getID_medicamento() {
        return ID_medicamento;
    }

    public void setID_medicamento(int ID_medicamento) {
        this.ID_medicamento = ID_medicamento;
    }

    public String getComposicion_quimica() {
        return composicion_quimica;
    }

    public void setComposicion_quimica(String composicion_quimica) {
        this.composicion_quimica = composicion_quimica;
    }

    public long getFecha_vecimiento() {
        return fecha_vecimiento;
    }

    public void setFecha_vecimiento(long fecha_vecimiento) {
        this.fecha_vecimiento = fecha_vecimiento;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
}
