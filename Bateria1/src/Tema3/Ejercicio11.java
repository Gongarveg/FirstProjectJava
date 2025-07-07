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
public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Esta aplicacion sirve para para de Mb a kB ");
        Scanner s = new Scanner(System.in);
        System.out.println("introduce los Kb");
        double kb; 
        double mb = s.nextDouble();
        kb = mb * 1000;
        System.out.println(mb + " Mb son " + kb + "kB");
        s.close();
        
    }
}
