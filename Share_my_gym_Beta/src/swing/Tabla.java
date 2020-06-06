/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import static Download_system.saveImage.saveImage;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
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
    
    private List<String> imagenes= new LinkedList<String>();
    
    
    public List ver_tabla(JTable tabla,String Type,JSONArray jArray) throws IOException{//devuelve images
        
        tabla.setDefaultRenderer(Object.class, new Render());
        ImageIcon water = new ImageIcon("C:\\Users\\Rafael_Ordonez\\Desktop\\Share_my_gym_Beta\\src\\swing\\images\\icons8_LinkedIn_96px.png");
        ImageIcon water1 = new ImageIcon("C:\\Users\\Rafael_Ordonez\\Desktop\\Share_my_gym_Beta\\src\\swing\\images\\600x400_kastra.jpg");
        ImageIcon water2 = new ImageIcon("C:\\Users\\Rafael_Ordonez\\Desktop\\Share_my_gym_Beta\\src\\swing\\images\\descarga.jpg");
         ImageIcon water3 = new ImageIcon("C:\\Users\\Rafael_Ordonez\\Desktop\\Share_my_gym_Beta\\src\\swing\\images\\descarga (1).jpg");
        JButton btn1 = new JButton(water);
        btn1.setName("m");
         JButton btn2 = new JButton(water1);
        btn2.setName("e");
        JButton btn3 = new JButton(water2);
        btn3.setName("e");
          JButton btn4 = new JButton(water3);
        btn4.setName("t");
            JButton descripcion_btn = new JButton("Descripcion");
        descripcion_btn.setName("decripcion");
        
        if(Type=="Timeline"){//ESTA TABLA ESTA EN EL APARTADO HOME
            
                DefaultTableModel d = new DefaultTableModel
            (
                    new Object[][]{{btn2},{btn4},{btn3},{btn3},{btn2},{btn4},{btn1},{btn2},{btn3},{btn1},{btn2},{btn3},{btn4},{btn4},{btn2},{btn2},{btn2},{btn2},{btn2},{btn2},{btn2},{btn2},{btn2},{btn2}},
                    new Object[]{"Last Publications"}
            )
            {
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
        
                tabla.setModel(d);
       
                tabla.setRowHeight(400);
                tabla.getColumn("Last Publications").setPreferredWidth(950);
                tabla.setPreferredScrollableViewportSize(tabla.getPreferredSize());
            
        }else{//APARTADO DE BUSQUEDA
            
             
                 
            JButton boton_hola = new JButton("HOLA");
            JButton boton_adios = new JButton("adios");
            boton_hola.setName("hola");
            boton_adios.setName("adios");
            
            ImageIcon imagen1 ;
            ImageIcon imagen2 ;
            ImageIcon imagen3 ;
            ImageIcon imagen4 ;
            ImageIcon imagen5 ;
           
            
            JButton btn_1 = new JButton(water);
            btn1.setName("descripcion");
             JButton btn_2 = new JButton(water);
            btn1.setName("descripcion");
             JButton btn_3 = new JButton(water);
            btn1.setName("descripcion");
             JButton btn_4 = new JButton(water);
            btn1.setName("descripcion");
             JButton btn_5 = new JButton(water);
            btn1.setName("descripcion");
        
            
            
                 for(int i=0;i<jArray.size();i++){
                    //JELem = jArray.get();
                    JSONArray jCurrent = (JSONArray) jArray.get(i);
                    String imagen="";
                   
                    imagenes.add(jCurrent.get(2).toString());
                    descripciones.add
                  
                    JOptionPane.showMessageDialog(null, jCurrent.toString(), "Información", JOptionPane.INFORMATION_MESSAGE);
                    //timeline.add
                }
                 
                  Object[][] busqueda=new Object[10][2] ;
                  int indice=0;
                  boolean completo=false;
                 for(int i=0;i<10;i++){
                     for(int j=0;j<2;j++){
                         if(!completo){
                                   InputStream input = new URL("https://39383197.servicio-online.net/"+imagenes.get(indice)).openStream();
                            BufferedImage image = ImageIO.read(input);
                            Image newimg = image.getScaledInstance( 70, 80,  java.awt.Image.SCALE_SMOOTH ) ;
                            ImageIcon icon = new ImageIcon(newimg);
                             JButton btn = new JButton(icon);
                             btn.setName("descripcion");
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
                 
                 
                 
                 /*
                 
                 InputStream input = new URL("https://39383197.servicio-online.net/"+imagenes.get(0)).openStream();
                 BufferedImage image = ImageIO.read(input);
                  Image newimg = image.getScaledInstance( 70, 80,  java.awt.Image.SCALE_SMOOTH ) ;
                 ImageIcon icon = new ImageIcon(newimg);
                 
                 InputStream input1 = new URL("https://39383197.servicio-online.net/"+imagenes.get(1)).openStream();
                 BufferedImage image1 = ImageIO.read(input1);
                  Image newimg1 = image.getScaledInstance( 50, 60,  java.awt.Image.SCALE_SMOOTH ) ;
                 ImageIcon icon1 = new ImageIcon(newimg);
                
                 InputStream input2 = new URL("https://39383197.servicio-online.net/"+imagenes.get(2)).openStream();
                 BufferedImage image2 = ImageIO.read(input);
                  Image newimg2 = image.getScaledInstance( 50, 60,  java.awt.Image.SCALE_SMOOTH ) ;
                 ImageIcon icon2 = new ImageIcon(newimg);
                 /*
                 InputStream input3 = new URL("https://39383197.servicio-online.net/"+imagenes.get(3)).openStream();
                 BufferedImage image3 = ImageIO.read(input);
                  Image newimg3 = image.getScaledInstance( 50, 60,  java.awt.Image.SCALE_SMOOTH ) ;
                 ImageIcon icon3 = new ImageIcon(newimg);
                 
                 InputStream input4 = new URL("https://39383197.servicio-online.net/"+imagenes.get(4)).openStream();
                 BufferedImage image4 = ImageIO.read(input);
                  Image newimg4 = image.getScaledInstance( 50, 60,  java.awt.Image.SCALE_SMOOTH ) ;
                 ImageIcon icon4 = new ImageIcon(newimg);
                 
                   JButton btn__ = new JButton(icon);
                    btn1.setName("descripcion");
                    JButton btnhh = new JButton(icon);
                    btn1.setName("descripcion");
                     JButton btnhhh = new JButton(icon2);
                    btn1.setName("descripcion");
               */
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
