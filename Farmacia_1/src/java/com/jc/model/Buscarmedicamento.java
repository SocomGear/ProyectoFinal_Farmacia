/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;

import static java.lang.System.out;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author Deyanira
 */
public class Buscarmedicamento {
    static Conexion con;
    public Buscarmedicamento(){
        con = new Conexion();
    }
    
    public void buscar(Medicamento u)throws Exception{
     Connection cone=   con.conectarse();
   CallableStatement callate=  cone.prepareCall("{call buscar_medicamento(?)}");
   callate.setInt(1,u.getID_medicamento());
   System.out.println("Busqueda exitosa");
   callate.getInt(u.getID_medicamento());
   callate.getString(u.getComposicion_quimica());
   callate.close();
   cone.close();
    
 }
    
}
