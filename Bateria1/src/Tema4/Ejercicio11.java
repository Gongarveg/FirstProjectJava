/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa calcula los segundos que faltan para llegar a media noche segun la hora exacta.");
        System.out.print("Introduce la hora: ");
        int hour = s.nextInt();
        System.out.print("Introduce los minutos: ");
        int min = s.nextInt();
        System.out.print("Introduce los segundos");
        int sec = s.nextInt();
        int result = 84600 - (hour * 3600 + min * 60 + sec);
        System.out.println(result);
        
        
    }
}
