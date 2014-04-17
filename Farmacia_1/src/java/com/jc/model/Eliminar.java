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
public class Eliminar {
    static Conexion  con;
    public Eliminar(){
        con=new Conexion();
    }
    
    public void eliminar(Usuarios u)throws Exception{
     Connection cone=   con.conectarse();
   CallableStatement callate=  cone.prepareCall("{call eliminar(?)}");
   callate.setString(1,u.getLogin());
   callate.executeUpdate();
   callate.close();
   cone.close();
   System.out.println("se elimino con exito");
    
 }
    
}
