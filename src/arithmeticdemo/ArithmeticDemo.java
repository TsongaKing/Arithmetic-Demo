/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticdemo;

import java.util.Scanner;

/**
 *
 * @author phang
 */
public class ArithmeticDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        int average;
        
        Scanner Phangi = new Scanner(System.in);
        
        System.out.println("Please enter an integer >> ");
        firstNumber = Phangi.nextInt();
        System.out.println("Please enter another integer>> ");
        secondNumber = Phangi.nextInt();
        
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2;
        
        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
    
}
