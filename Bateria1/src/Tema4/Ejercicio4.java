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
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hourPrice = 12;
        float extraHours = 0;
        System.out.println("escribe tus horas trabajadas");
        float hours = s.nextFloat();
        
        if (hours > 40) {
            extraHours = hours - 40;
        }
        double salario =   * extraHours;
        System.out.println("tu slario es: " + salario);

    }
}
