/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author jquin
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("introduce dos numeros");
        
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        
        double mul = num1 * num2;
        double div = num1 / num2;
        double sum = num1 + num2;
        double res = num1 - num2;
        
        System.out.println("Suma: " + sum);
        System.out.println("Resta: " + res);
        System.out.println("Multiplicacion: " + mul);
        System.out.println("Division: " + div);
    }
}
