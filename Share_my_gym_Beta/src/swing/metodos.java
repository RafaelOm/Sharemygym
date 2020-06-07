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
    
  
    
    public void modificar_datos(JSONObject obj){
        String result = ServerService.sendPost("profile.php", obj);
    }
    
    public void darLike(JSONObject obj){
        ServerService.sendPost("likes.php",obj);
    }
    
    
    
}
