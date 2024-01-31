/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sale_System;

/**
 *
 * @author sitor
 */
public class SalesProduct {
    
    public double processor;
    public double harddisk;
    public double ram;
    public double vga;
    public double soundcard;
    public double opticaldrive;
    
    public double mouse;
    public double keyboard;
    public double webcam;
    public double monitor;
    public double headset;
    public double connector;
    
    public double printer;
    public double scanner;
    public double speaker;
    public double flashdisk;
    public double cpu;
    public double motherboard;
    
    public double itemcost1;
    public double itemcost2;
    public double itemcost3;
    public double itemcost;
    
    public double GetAmount(){
        
        itemcost1 = processor + harddisk + ram + vga + soundcard + opticaldrive;
        itemcost2 = mouse + keyboard + webcam + monitor + headset + connector;
        itemcost3 = printer + scanner + speaker + flashdisk + cpu + motherboard;
        itemcost = itemcost1 + itemcost2 + itemcost3;
        return(itemcost);
    }
    
    public double pprocessor = 865000;
    public double pharddisk = 695000;
    public double pram = 205000;
    public double pvga = 700000;
    public double psoundcard = 55000;
    public double popticaldrive = 9000000;
    
    public double pmouse = 230000;
    public double pkeyboard= 115000;
    public double pwebcam = 250000;
    public double pmonitor = 700000;
    public double pheadset = 120000;
    public double pconnector = 210000;
    
    public double pprinter = 600000;
    public double pscanner = 330000;
    public double pspeaker = 135000;
    public double pflashdisk = 125000;
    public double pcpu = 575000;
    public double pmotherboard = 800000;
    
}

