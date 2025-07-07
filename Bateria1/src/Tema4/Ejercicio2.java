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
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe la hora");
        double hour = s.nextDouble();
        String result = "";
        

        if (hour > 1 && hour <= 12) {
            result = "Buenos dias";

        } else if (hour > 13 && hour <= 19) {
            result = "Buenas tardes";

        } else if (hour > 20 && hour <= 24) {
            result = "Buenas noches";

        } else  {
            result = "Esta hora no existe";

        }
        System.out.println(result);
    }
}
