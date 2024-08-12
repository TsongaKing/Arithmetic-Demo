/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phang
 */
public class InchesToFeet {
    public static int INCHES_PER_FOOT = 12;
    
    public static void main(String[] args) {
        int inches = 86;
        int foot = inches / INCHES_PER_FOOT;
        int remainingInches = inches % INCHES_PER_FOOT;
        
        System.out.println(inches + " inches is equal to " + foot + " foot and " + remainingInches + " inches");
        
    }
    
}
