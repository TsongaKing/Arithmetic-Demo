
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phang
 */
public class InchesTofeetInteractive {
   public static int INCHES_PER_FOOT = 12;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter inches: ");
        int inches = scanner.nextInt();
        int foot = inches / INCHES_PER_FOOT;
        int remainingInches = inches % INCHES_PER_FOOT;
        
        System.out.println(inches + " inches is equal to " + foot + " foot and " + remainingInches + " inches");
        
    }  
}
