/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanfranco.portfolio.Security.Controller;

/**
 *
 * @author dario
 */
public class Mensaje {
    private String mensajes;
    
    //Constructor

    public Mensaje() {
    }

    public Mensaje(String mensajes) {
        this.mensajes = mensajes;
    }
    
    //getter y setter

    public String getMensajes() {
        return mensajes;
    }

    public void setMensajes(String mensajes) {
        this.mensajes = mensajes;
    }
    
    
    
}
