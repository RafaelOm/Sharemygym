/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import org.json.simple.JSONObject;

/**
 *
 * @author Rafa_Ordonez
 */

public class update_puntuation {
    
    
    
    public void update_puntuation(int puntuation,int Publication_id){
          //Creamos un objeto JSON
        JSONObject jsonObj = new JSONObject();
        //Añadimos el id y la puntruacion al JSON
        jsonObj.put("id",Publication_id);
        jsonObj.put("Puntuation", puntuation);
        ServerService.sendPost("update_ranking.php",jsonObj);
        
        
    }
    
}
