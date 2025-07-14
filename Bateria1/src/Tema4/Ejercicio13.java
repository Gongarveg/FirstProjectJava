/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author jquin
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa ordena tres numeros escritos por teclado");
        System.out.print("Escribe el primer numero: ");
        int num1 = s.nextInt();
        System.out.print("Ecribe el segundo numero: ");
        int num2 = s.nextInt();
        System.out.print("Escribe el tercer numero: ");
        int num3 = s.nextInt();
        String result = "";

        if (num1 < num2) {
            if (num1 < num3) {
                 result = "" + num1;
            } else if (num3 < num2) {
                result += "" + num3;
            } else if (num2 < num3) {
                result += "" + num2;
            }
        }

        System.out.println("Este es el resultado: " + result);

    }
}
