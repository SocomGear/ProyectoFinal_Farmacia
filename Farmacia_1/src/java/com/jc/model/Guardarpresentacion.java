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
public class Guardarpresentacion {
     static Conexion  con;
    
    public Guardarpresentacion(){
        con=new Conexion();
    }
    
    public void insertar(Presentacion u)throws Exception{
     Connection cone=   con.conectarse();
   CallableStatement callate=  cone.prepareCall("{call guardar_presentacion(?,?,?)}");
   callate.setInt(1,u.getID_presentacion());
   callate.setInt(2,u.getID_medicamento());
   callate.setString(3, u.getNombre());
   callate.executeUpdate();
   callate.close();
   cone.close();
   System.out.println("Se guardo el registro con exito");
    
 }
    
}
