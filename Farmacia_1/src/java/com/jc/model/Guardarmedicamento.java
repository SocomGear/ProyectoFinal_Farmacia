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
import java.sql.*;
public class Guardarmedicamento {
     static Conexion  con;
    
    public Guardarmedicamento(){
        con=new Conexion();
    }
    
    public void guardar(Medicamento u)throws Exception{
     Connection cone=   con.conectarse();
   CallableStatement callate=  cone.prepareCall("{call guardar_medicamento(?,?,?,?)}");
   callate.setInt(1,u.getID_medicamento());
   callate.setString(2,u.getComposicion_quimica());
   callate.setLong(3,u.getFecha_vecimiento());
   callate.setFloat(4,u.getPrecio());
   callate.executeUpdate();
   callate.close();
   cone.close();
   System.out.println("Se guardo con exito");
    
 }
    
}
