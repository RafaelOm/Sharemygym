/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Publications;

/**
 *
 * @author Rafa_Ordonez
 */
public class imagen {
    
    private String url;
    private String descripcion;
    private int tipo;
    private String id;
    
    public imagen(int tipo, String descripcion, String url,String id){
        this.url=url;
        this.descripcion=descripcion;
        this.tipo=tipo;
        this.id=id;
        
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public String getUrl(){
        return url;
    }
    public int Tipo(){
        return tipo;
    }
    public String getId(){
        return id;
    }
    
}
