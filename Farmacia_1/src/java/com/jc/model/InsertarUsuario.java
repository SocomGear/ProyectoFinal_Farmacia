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
public class InsertarUsuario {
    static Conexion  con;
    
    public InsertarUsuario(){
        con=new Conexion();
    }
    
    public void insertar(Usuarios u)throws Exception{
     Connection cone=   con.conectarse();
   CallableStatement callate=  cone.prepareCall("{call Insertar_usuario(?,?,?)}");
   callate.setInt(1,u.getID_usuario());
   callate.setString(2,u.getLogin());
   callate.setString(3, u.getPassword());
   callate.executeUpdate();
   callate.close();
   cone.close();
   System.out.println("Se inserto el registro con exito");
    
 }
    
    
}
