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
public class Ejercicio05 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("escribe las medidas del rectangulo");
        
        double width = s.nextDouble();
        double height = s.nextDouble();
        
        double total = width * height;
        
        System.out.println("el area del rectangulo es " + total + " metros cuadrados");
        
    }
}
