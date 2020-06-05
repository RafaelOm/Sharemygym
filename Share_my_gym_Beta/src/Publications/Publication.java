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
public interface Publication {
   
    public int get_publication_id();
    
    public void set_name(String name);
    
    public String get_name();
    
    public int get_creator_id();
    
    public void increase_puntuation();
    
    public int get_puntuation();
    
    public void modify_pub(String new_image);
    
    public String get_URL();
    
}
