/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sale_System;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sitor
 */
public class Exit_Sales {
    
    private JFrame frame;
    
    public void quit(){
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Sales Management System",
                JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
}
