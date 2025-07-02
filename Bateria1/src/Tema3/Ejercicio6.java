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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escribe la base y la altura del triangulo");
        
        float width = s.nextFloat();
        float heigh = s.nextFloat();
        float total = width * heigh / 2;
        
        System.out.println("El areadel triangulo es: " + total );    
        
    }
}
