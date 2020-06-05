/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Tabla{
    
    public void ver_tabla(JTable tabla,String Type){
        
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
        
        if(Type=="Timeline"){
            
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
            
        }else{
            JButton boton_hola = new JButton("hola");
            JButton boton_adios = new JButton("adios");
            boton_hola.setName("hola");
            boton_adios.setName("adios");
            
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
