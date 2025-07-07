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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double iva = 21 / 100;
        double total;
        System.out.println("Escribe la base imponible de la factura");
        double base = s.nextDouble();
        total = iva * base;
        System.out.println(total);
    }
}
