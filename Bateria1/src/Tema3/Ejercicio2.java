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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escribe el numero de euros que quieres convertir a pesetas");
        
        double euros = s.nextDouble();
        double pesetas = s.nextDouble();
        double total = euros * pesetas;
        
        System.out.println(euros + "euros son " + total + "pesetas");
    }
}
