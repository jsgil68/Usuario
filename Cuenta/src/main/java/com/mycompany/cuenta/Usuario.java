/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuenta;

import java.util.Vector;

/**
 *
 * @author USUARIO
 */
class Usuario {

    private String nick;
    private String contraselaña;
    private String rango;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraselaña() {
        return contraselaña;
    }

    public void setContraselaña(String contraselaña) {
        this.contraselaña = contraselaña;
    }

    public String getRango() {
        return rango;
    }

    public static int verificarUsuarioNuevo(String usuario) {
        Vector lista = mostrar();
        Usuario obj;
        GFG obje;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(usuario)) {
                return i;
            }
        }
        
        return -1;
    }

    public static int verificarLogueo(String usuario,String contraseña){
        Vector lista = mostrar ();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(usuario) && obj.getContraselaña().equalsIgnoreCase(contraseña) ) {
                return i;
            }
            }
        return -1;
    }
        
 
    
    public void setRango(String rango) {
        this.rango = rango;
    }

    public static Vector mostrar() {
        return ListaUsuario.mostrar();
    }
}
