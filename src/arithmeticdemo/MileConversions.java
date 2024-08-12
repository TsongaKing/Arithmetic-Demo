/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmeticdemo;

/**
 *
 * @author phang
 */
public class MileConversions {
    public static int INCHES_PER_MILES = 63360;
    public static final int FEET_PER_MILES = 5280;
    public static final int YARDS_PER_MILES = 1760;
    
    public static void main(String[] args) {
        
        double miles = 3;
        int inches = (int) (miles * INCHES_PER_MILES);
        int feet = (int) (miles * FEET_PER_MILES);
        int yards = (int) (miles * YARDS_PER_MILES);
        
        System.out.println(miles + " miles is equal to: ");
        System.out.println(inches + " inches");
        System.out.println(feet + "  feet");
        System.out.println(yards + "   yards");
    }
    
}
