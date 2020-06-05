/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        if(value instanceof JButton){
            JButton btn = (JButton)value;
            if(isSelected){
                btn.setForeground(table.getSelectionForeground());
      btn.setBackground(table.getSelectionBackground());
      btn.setBackground(UIManager.getColor("Button.background"));
            }else{
                btn.setForeground(table.getForeground());
      btn.setBackground(UIManager.getColor("Button.background"));
     //btn.setBackground(Color.white);
     
   
     
            }
            return btn;
        }
        
        
        if(value instanceof JCheckBox){
            JCheckBox ch = (JCheckBox)value;
            return ch;
        }
        
        return super.getTableCellRendererComponent(table, value, isSelected, 
                hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }

    
}
