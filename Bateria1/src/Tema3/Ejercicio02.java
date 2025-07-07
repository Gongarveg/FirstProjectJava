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
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escribe el numero de euros que quieres convertir a pesetas");
        
        float euros = s.nextFloat();
        double pesetas = 166.836;
        double total = euros * pesetas;
        
        System.out.println(euros + " euros son " + total + " pesetas");
    }
}
