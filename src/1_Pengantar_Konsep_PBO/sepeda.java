package com.mycompany.sepeda;

/**
 * @author RianBtk
 */
public class sepeda {
    private String brand; private  int speed; private int maxspeed;
    
    public void setBrand (String newValue) {
        brand = newValue;
    } public void maxSpeed(int newValue) {
        maxspeed =newValue;
    } public void xSpeed(int increment) {
        speed = speed + increment;
    } public void suspensi(int decrement) {
        speed = speed + decrement;
    } public void cetakStatus() {
        System.out.print("Brand:"+brand);
        System.err.println("Speed:"+speed);
        System.err.println("Max Speed:"+maxspeed);
    }
}
