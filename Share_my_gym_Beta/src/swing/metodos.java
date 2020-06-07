/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import Controllers.ServerService;
import org.json.simple.JSONObject;

/**
 *
 * @author Rafa_Ordonez
 */
public class metodos {
    
  
    
    public String modificar_datos_usuario(JSONObject obj){
        String result = ServerService.sendPost("profile.php", obj);
        return result;
    }
    
    public String devolver_datos_usuario(JSONObject obj){
        String result = ServerService.sendPost("profile.php", obj);
        return result;
    }
    
    public void darLike(JSONObject obj){
        ServerService.sendPost("likes.php",obj);
    }
    
    public String verLikes(JSONObject obj){
        return ServerService.sendPost("verlikes.php", obj);
    }

}
