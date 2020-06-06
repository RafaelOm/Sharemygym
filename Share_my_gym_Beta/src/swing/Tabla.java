/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import static Download_system.saveImage.saveImage;
import Publications.imagen;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;


public class Tabla{
    
    private List<imagen> imagenes= new LinkedList<imagen>();
    
    
    public List ver_tabla(JTable tabla,String Type,JSONArray jArray) throws IOException{//devuelve images
        
        tabla.setDefaultRenderer(Object.class, new Render());
        
        
        if(Type=="Timeline"){//ESTA TABLA ESTA EN EL APARTADO HOME
            tabla.removeAll();
                 for(int i=0;i<jArray.size();i++){
                    //JELem = jArray.get();
                    JSONArray jCurrent = (JSONArray) jArray.get(i);
                    imagen img =new imagen(parseInt(jCurrent.get(0).toString()),jCurrent.get(1).toString(),jCurrent.get(2).toString(),jCurrent.get(3).toString());
                   
                    imagenes.add(img);
                  
                  
                    
                    //timeline.add
                }
                 
                  Object[][] busqueda=new Object[10][1] ;
                  int indice=0;
                  boolean completo=false;
                 for(int i=0;i<10;i++){
                     for(int j=0;j<1;j++){
                         if(!completo){
                                   InputStream input = new URL("https://39383197.servicio-online.net/"+imagenes.get(indice).getUrl()).openStream();
                            BufferedImage image = ImageIO.read(input);
                            Image newimg = image.getScaledInstance( 100, 120,  java.awt.Image.SCALE_SMOOTH ) ;
                            ImageIcon icon = new ImageIcon(newimg);
                             JButton btn = new JButton(icon);
                           
                           btn.setName(imagenes.get(indice).getId());
                         busqueda[i][j]=btn;
                         
                         indice++;
                         }else{
                             busqueda[i][j]= new JButton(" ");
                         }
                      
                         if(imagenes.size()==indice){
                             completo=true;
                         }
                     }
                      
                 }
                 
                 
                 
              
             DefaultTableModel d = new DefaultTableModel
            (
                    busqueda,
                    new Object[]{"LAST PUBLICATIONS"}
            )
            {
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
              
                tabla.setModel(d);
                tabla.setCellSelectionEnabled(false);
       
                tabla.setRowHeight(120);
                tabla.getColumn("LAST PUBLICATIONS").setPreferredWidth(100);
                
                tabla.setPreferredScrollableViewportSize(tabla.getPreferredSize());
           
            
        }else{//APARTADO DE BUSQUEDA
            
             
                 tabla.removeAll();
                 for(int i=0;i<jArray.size();i++){
                    //JELem = jArray.get();
                    JSONArray jCurrent = (JSONArray) jArray.get(i);
                    imagen img =new imagen(parseInt(jCurrent.get(0).toString()),jCurrent.get(1).toString(),jCurrent.get(2).toString(),jCurrent.get(3).toString());
                   
                    imagenes.add(img);
                  
                  
                   
                    //timeline.add
                }
                 
                  Object[][] busqueda=new Object[10][2] ;
                  int indice=0;
                  boolean completo=false;
                 for(int i=0;i<10;i++){
                     for(int j=0;j<2;j++){
                         if(!completo){
                                   InputStream input = new URL("https://39383197.servicio-online.net/"+imagenes.get(indice).getUrl()).openStream();
                            BufferedImage image = ImageIO.read(input);
                            Image newimg = image.getScaledInstance( 70, 80,  java.awt.Image.SCALE_SMOOTH ) ;
                            ImageIcon icon = new ImageIcon(newimg);
                             JButton btn = new JButton(icon);
                             btn.setName(imagenes.get(indice).getId());
                         busqueda[i][j]=btn;
                         
                         indice++;
                         }else{
                             busqueda[i][j]= new JButton(" ");
                         }
                      
                         if(imagenes.size()==indice){
                             completo=true;
                         }
                     }
                      
                 }
                 
                 
                 
              
             DefaultTableModel d = new DefaultTableModel
            (
                    busqueda,
                    new Object[]{"col_1","col_2"}
            )
            {
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
              
                tabla.setModel(d);
                tabla.setCellSelectionEnabled(false);
       
                tabla.setRowHeight(100);
                tabla.getColumn("col_1").setPreferredWidth(70);
                tabla.getColumn("col_2").setPreferredWidth(70);
                tabla.setPreferredScrollableViewportSize(tabla.getPreferredSize());
                
            
        }
       
        
        
            return imagenes;

    }
}
