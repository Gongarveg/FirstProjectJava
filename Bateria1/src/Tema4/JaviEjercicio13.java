/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author Nai
 */
public class JaviEjercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for three numbers
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        // Find the largest number
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        // Find the smallest and the middle number
        int smallest, middle;
        if (a <= b && a <= c) {
            smallest = a;
            middle = (b <= c) ? b : c;
        } else if (b <= a && b <= c) {
            smallest = b;
            middle = (a <= c) ? a : c;
        } else {
            smallest = c;
            middle = (a <= b) ? a : b;
        }

        // Print results
        System.out.println("Largest: " + largest);
        System.out.println("Sorted (ascending): " + smallest + ", " + middle + ", " + largest);
    }
}
