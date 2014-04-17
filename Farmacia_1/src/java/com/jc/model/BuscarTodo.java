/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Deyanira
 */
public class BuscarTodo {
    static Conexion con;
    public BuscarTodo(){
        con=new Conexion();
    }
    
    public static ArrayList<Medicamento> buscarTodos()throws Exception {
       ArrayList<Medicamento> medi=new ArrayList<Medicamento>();
       //Primero  nos conectamos a la base de datos
       Connection conexion= con.conectarse();
       //Crear un Statement de SQL
       Statement st=conexion.createStatement();
                 ResultSet res=st.executeQuery("select * from Medicamento order by ID_medicamento");
                 while(res.next()){
                  int id=res.getInt(1);
                  String com=res.getString(2);
                  long fecha=res.getLong(3);
                  Float pre=res.getFloat(4);
                  Medicamento u=new Medicamento(id,com,fecha,pre);
                  medi.add(u);
                  
                 }
                 
                 return medi;
    
}}
