/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmeticdemo;

import java.util.Scanner;

/**
 *
 * @author phang
 */
public class QuartsToGallonsInteractive {
     // contstant for quarts in a gallon
    public static int QUARTS_PER_GALLON = 4;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Enter the number of quarts needed for the job: ");
        int quartsNeeded = scanner.nextInt();
        // Number quarts needed for the job
       // int quartsNeeded = 18;
        // cALCULATE THE NUMBER OF GALLONS
        int gallonsNeeded = quartsNeeded / QUARTS_PER_GALLON;
        // Calculate the remaing quarts
        int remainingQuarts = quartsNeeded % QUARTS_PER_GALLON;
       
            // Displays the results                    
     System.out.println("A job that needs " + quartsNeeded + " Quarts requires " + 
             gallonsNeeded + " Gallons Plus " + remainingQuarts + " quarts");
    }
}
