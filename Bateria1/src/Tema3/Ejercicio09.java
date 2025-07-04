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
public class Ejercicio09 {

    public static void main(String[] args) {
        System.out.println("Esta aplicaicon sirve para calcular el area de un cono");
        Scanner s = new Scanner(System.in);
        System.out.println("escribe el radio de la base del cono");
        float radio = s.nextFloat();
        System.out.println("escribe la altura del cono");
        float height = s.nextFloat();
        double areaTotal = height * Math.pow(radio, 2) * 3.1416 * 1 / 3;
        System.out.println("el area del cono son " + areaTotal + "m3");
    }
}
