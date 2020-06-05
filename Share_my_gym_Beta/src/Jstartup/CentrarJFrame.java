/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jstartup;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Rafael Ordoñez
 */
public class CentrarJFrame extends JFrame {
  public CentrarJFrame(){
      super("Centrar JFrame");	
 
      Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
      int height = pantalla.height;
      int width = pantalla.width;
      setSize(width/2, height/2);		
 
      setLocationRelativeTo(null);		
      setVisible(true);
  }
}