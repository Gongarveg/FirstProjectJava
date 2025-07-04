/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3;

import java.util.Scanner;

/**
        double mb;
        
 *
 * @author gonza
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Esta aplicacion sirve para para de Kb a Mb ");
        Scanner s = new Scanner(System.in);
        System.out.println("introduce los Kb");
        double kb = s.nextDouble();
        double mb;
        mb = kb / 1000;
        System.out.println(kb + " kB son " + mb + "Mb");
        
        
        
    }
}
