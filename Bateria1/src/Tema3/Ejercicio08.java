/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int money = 12;
        System.out.println("escribe tus horas trabajadas");
        float hours = s.nextFloat();
        double salario = money * hours;
        System.out.println("tu slario es: " + salario);
        
        
        
    }
}
