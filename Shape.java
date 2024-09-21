package shapes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class Shape {
    // balok
    public double volume(double p,double l,double t){
        return p*l*t;
    }
    
    public double luas(double p,double l,double t){
        return 2*((p*l) + (p*t) + (l*t));
    }
    
    // kubus 
    public double volume(double r){
        return r*r*r;
    }
    
    public double luas(double r){
        return 6*r*r;
    }
}
