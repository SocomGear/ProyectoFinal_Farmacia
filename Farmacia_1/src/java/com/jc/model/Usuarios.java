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
public class Usuarios {
    private int ID_usuario;
    private String login;
    private String password;

    public Usuarios(int ID_usuario, String login, String password) {
        this.ID_usuario = ID_usuario;
        this.login = login;
        this.password = password;
    }

    public int getID_usuario() {
        return ID_usuario;
    }

    public void setID_usuario(int ID_usuario) {
        this.ID_usuario = ID_usuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
