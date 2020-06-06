/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jstartup;

/**
 *
 * @author LordCoder
 */
public class Usuario {
    private String usuario;
    private String email;
    private String password;
    public Usuario(String u, String e, String p){
        this.usuario=u;
        this.email=e;
        this.password=p;
    }
    
    public String getUser(){
        return usuario;
        
    }
    
    public String getPassword(){
        return password;
        
    }
}
