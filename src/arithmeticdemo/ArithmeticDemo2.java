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
public class ArithmeticDemo2 {
    
    public static void main(String[] args) {
        
        double firstNumber;
        double secondNumber;
        double sum;
        double difference;
        double average;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a double >> ");
         firstNumber = scanner.nextDouble();
        System.out.println("Please enter another double >> ");
         secondNumber = scanner.nextDouble();
        
         sum = firstNumber + secondNumber;
         difference = firstNumber - secondNumber;
         average = sum / 2;
        
        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
    
}
