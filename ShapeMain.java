/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author acer
 */
public class ShapeMain {
    public static void main(String[] args){
        Shape balok = new Shape();
        System.out.println("Volume dan luas permukaan balok");      
        System.out.println("Volume = "+balok.volume(2,3,4));
        System.out.println("Luas Permukaan = "+balok.luas(2,3,4));
        
        Shape kubus = new Shape();
        System.out.println("Volume dan luas permukaan kubus");      
        System.out.println("Volume = "+kubus.volume(3));
        System.out.println("Luas Permukaan = "+kubus.luas(3));
    }
}
