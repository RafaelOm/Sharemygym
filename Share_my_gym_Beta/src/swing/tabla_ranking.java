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


public class tabla_ranking{
    
    
    
    
    public void ver_tabla(JTable tabla,String matriz[][]){
        
       
     
                 
                 
                 
              
             DefaultTableModel d = new DefaultTableModel
            (
                    matriz,
                    new Object[]{"USER","POINTS"}
            )
            {
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
              
                tabla.setModel(d);
                tabla.setCellSelectionEnabled(false);
       
              
                tabla.setPreferredScrollableViewportSize(tabla.getPreferredSize());
                
                
            
        }
       
        
        
           

    }

