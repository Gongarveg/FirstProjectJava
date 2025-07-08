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
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Esta aplicacion sirve para calcular medias");
        
        System.out.print("Escribe la nota 1: ");
        double calification1 = s.nextDouble();
        System.out.print("Ecribe la nota 2: ");
        double calification2 = s.nextDouble();
        System.out.print("Ecribe la nota 3: ");
        double calification3 = s.nextDouble();
        double result = (calification1 + calification2 + calification3) / 3;
        if (result < 0) {
            result = 0;
        }

        System.out.println("la media de estas notas es: " + result);

    }
}
