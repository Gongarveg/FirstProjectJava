/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3;

/**
 *
 * @author jquin
 */
import java.util.Scanner;
public class Ejericio01 {
     public static void main(String[] args) {
             Scanner s = new Scanner(System.in);
             
             System.out.println("Escribe dos numeros que quieras multiplicar");
             
             double num1 = s.nextDouble();
             double num2 = s.nextDouble();
             
             double total = num1 * num2;
             
             System.out.println("El resultado de la multiplicacion de estos dos numeros es: " + total);
           
      }
}
