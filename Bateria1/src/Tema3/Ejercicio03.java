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
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escribe el numero de pesetas que quieres convertir a euros");
        
        float pesetas = s.nextFloat();
        float euros = 0.000030f;
        double total = pesetas * euros;
        
        System.out.println(pesetas + " pesetas son " + total + " euros");
    }
}
