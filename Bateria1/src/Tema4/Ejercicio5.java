/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Este programa resuleve ecuaciones de primer grado");
        Scanner s = new Scanner(System.in);
        
        System.out.print("Escribe el valor de a: ");
        float a = s.nextFloat();
        
        System.out.print("Ecribe el valor de b: ");
        float b = s.nextFloat();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        } else {
            double x = -b / a;
            System.out.println("La solucion es x = " + x);
        }
    }
}
