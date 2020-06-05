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
public class Diet implements Publication {
    
    private String name;
    private int Creator_Id;
    private int publication_id;
    private String URL;
    private int Current_Puntuation;
    
    
    public Diet(String name,int Creator_id, int publication_id,String URL){
        this.name=name;
        this.Creator_Id=Creator_id;
        this.publication_id=publication_id;
        this.URL=URL;
        
    }

    @Override
    public int get_publication_id() {
        return publication_id;
    }

    @Override
    public void set_name(String name) {
       this.name=name;
    }

    @Override
    public String get_name() {
        return name;
    }

    @Override
    public int get_creator_id() {
        return Creator_Id;
    }

    @Override
    public void increase_puntuation() {
        Current_Puntuation=+1;
        update_punctuation(publication_id,Current_Puntuation);
    }

    @Override
    public int get_puntuation() {
        return Current_Puntuation;
    }

    @Override
    public void modify_pub(String new_image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String get_URL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void update_punctuation(int publication_id, int Current_Puntuation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
