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
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Esta aplicacion sirve para calcular medias");
        
        System.out.print("Escribe la nota 1: ");
        double calification1 = s.nextDouble();
        System.out.print("Ecribe la nota 2: ");
        double calification2 = s.nextDouble();
        System.out.print("Ecribe la nota 3: ");
        double calification3 = s.nextDouble();
        String note = "";
        double result = (calification1 + calification2 + calification3) / 3;
        if (result > 10) {
            result = 10;
        }
        if (result < 0) {
            result = 0;
        }
        if (result <= 4.99 && result > 0) {
            note = "Insuficiente";
        }
        if (result <= 5.99 && result > 5) {
            note = "Suficiente";
        }
        if (result <= 6.99 && result > 6) {
            note = "Bien";
        }
        if (result <= 8.99 && result > 7) {
            note = "Notable";
        }
        if (result <= 10 && result > 9) {
            note = "Sobresaliente";
        }

        System.out.println("la media de estas notas es: " + result + "\t" + note);

    }

}
