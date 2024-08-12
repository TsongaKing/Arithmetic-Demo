
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phang
 */
public class Eggs {
   public static final double PRICE_PER_DOZEN = 3.25;  // Price per dozen eggs in Rands
    public static final double PRICE_PER_LOOSE_EGG = 0.45;  // Price per loose egg in Rands

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of eggs ordered: ");
        int eggsOrdered = scanner.nextInt();

        // Calculate dozens and loose eggs
        int dozens = eggsOrdered / 12;
        int looseEggs = eggsOrdered % 12;

        // Calculate cost
        double costDozens = dozens * PRICE_PER_DOZEN;
        double costLooseEggs = looseEggs * PRICE_PER_LOOSE_EGG;
        double totalCost = costDozens + costLooseEggs;

        // Display order details and cost
        System.out.println("You ordered " + eggsOrdered + " eggs.");
        System.out.println("That is " + dozens + " dozen at R" + String.format("%.2f", PRICE_PER_DOZEN) + " per dozen");
        if (looseEggs > 0) {
            System.out.println("and " + looseEggs + " loose eggs at R" + String.format("%.2f", PRICE_PER_LOOSE_EGG) + " each");
        }
        System.out.println("For a total of R" + String.format("%.2f", totalCost));
    }
    
}
