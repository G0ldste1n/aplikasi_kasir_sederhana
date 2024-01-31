/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sale_System;

import java.awt.event.KeyEvent;

/**
 *
 * @author sitor
 */
public class Sales_Tax {
    
    public double saleTax = 0.99;

    public Double cFindTax(double cAmount){
        double FindTax = cAmount - (cAmount * saleTax);
        return FindTax;
    
    }
    //===========Numbers Only=====================
    public void NumbersOnly(java.awt.event.KeyEvent evt)
    {
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
                || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)){
            evt.consume();
            
        }
            
        }
    }
    

