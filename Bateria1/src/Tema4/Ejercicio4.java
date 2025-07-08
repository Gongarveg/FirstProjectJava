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
        int hourPriceExtra = 16;
        float extraHours = 0;
        System.out.print("escribe tus horas trabajadas: ");
        float ordinaryHours = s.nextFloat();
        double salario;
        if (ordinaryHours > 40) {
            extraHours = ordinaryHours - 40;
            salario = 40 * hourPrice + extraHours * hourPriceExtra;
        } else {
           salario = ordinaryHours * hourPrice;
        }
        
        System.out.println("tu slario es: " + salario);

    }
}
