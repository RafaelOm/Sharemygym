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
    
    
    public void ver_tabla(JTable tabla,String Type,JSONArray jArray) throws IOException{
        
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
            
              InputStream input = new URL("https://39383197.servicio-online.net/images/716084.jpg").openStream();
                 BufferedImage image = ImageIO.read(input);
                  Image newimg = image.getScaledInstance( 50, 60,  java.awt.Image.SCALE_SMOOTH ) ;
                 ImageIcon HOLA = new ImageIcon(newimg);
                 
            JButton boton_hola = new JButton(HOLA);
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
                    Scanner sc = new Scanner(jCurrent.toString());
                    while(sc.hasNext()){
                        imagen=sc.next();
                    }//la ultima posicion es la direccion de la imagen en el servidor
                    imagenes.add(imagen);
                    JOptionPane.showMessageDialog(null, jCurrent.toString(), "Información", JOptionPane.INFORMATION_MESSAGE);
                    //timeline.add
                }
               
                 
               /* for(int j=0;j<imagenes.size();j++){
                    saveImage(imagenes.get(j));
                }
                
                imagen1= new ImageIcon("\images"+imagenes.get(0));
            */
               
             DefaultTableModel d = new DefaultTableModel
            (
                    new Object[][]{{btn1,btn1},{boton_hola,boton_adios},{boton_hola,btn1},{btn2,btn3},{btn1,btn1},{btn3,btn2}},
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
       
        
        
  

    }
}
