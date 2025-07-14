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
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa sirve para calcular el tiempo que tarda en caer un objeto.");
        System.out.print("Escribe la altura: ");
        float h = s.nextFloat();
        float g = 9.81f;
        if (h > 0) {
            double result = Math.sqrt(2 * h / g);
            System.out.println("Este objecto tarda en caer: " + result + "s.");
        } else {
            System.out.println("El objeto esta bajo tierra");
        }

    }
}
