/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.controladores;

import com.jc.model.Actualizar;
import com.jc.model.Medicamento;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Damian,Alejandro
 */
public class Servletactualizar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String mensaje="no Actualizado";
        
        int Id_medicamento=   Integer.parseInt(request.getParameter("Id_medicamento"));
        String comp = request.getParameter("composicion_quimica");
        long Fecha = Long.parseLong(request.getParameter("fecha_vecimiento"));
        float pre = Float.parseFloat(request.getParameter("precio"));
    
    
    Medicamento u=new Medicamento(Id_medicamento,comp,Fecha,pre);
   u.setID_medicamento(Id_medicamento);
   u.setComposicion_quimica(comp);
   u.setFecha_vecimiento(Fecha);
   u.setPrecio(pre);
   
   
   Actualizar gu=new Actualizar();
   try {
            gu.actualizar(u);
            mensaje=" Actualizado....... : )";
        } catch (Exception ex) {
   mensaje=ex.getMessage();
        }
              out.println(mensaje);
    }
}

