/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author Deyanira
 */
public class Actualizar {
    static Conexion  con;
    
  public Actualizar(){
        con=new Conexion();
    } 
  
  public void actualizar(Medicamento u)throws Exception{
     Connection cone=   con.conectarse();
   CallableStatement callate=  cone.prepareCall("{call actualizar(?,?,?,?)}");
   callate.setInt(1,u.getID_medicamento());
   callate.setString(2,u.getComposicion_quimica());
   callate.setLong(3, u.getFecha_vecimiento());
   callate.setFloat(4,u.getPrecio());
   callate.executeUpdate();
   callate.close();
   cone.close();
   System.out.println("Actualizado con exito");
    
 }
    
}
