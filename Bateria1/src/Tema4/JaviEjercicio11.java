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
public class JaviEjercicio11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe la hora con formato HH:mm:ss: ");
        String hour = s.nextLine();
        String[] split = hour.split(":");
        int maxSeconds = 86400;

        int remainSecs = maxSeconds - Integer.parseInt(split[0]) * 3600 + Integer.parseInt(split[1]) * 60 + Integer.parseInt(split[2]);

        System.out.println("Quedan para media noche: " + remainSecs +" segundos");

    }
}
