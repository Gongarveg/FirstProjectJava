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
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escribe el numero del dia de la semana: ");
        int dayNum = s.nextInt();
        String dayName = "";

        switch (dayNum) {

            case 1:
                dayName = "Lunes";
                break;
            case 2:
                dayName = "Martes";
                break;
            case 3:
                dayName = "Miercoles";
                break;
            case 4:
                dayName = "Jueves";
                break;
            case 5:
                dayName = "Viernes";
                break;
            case 6:
                dayName = "Sabado";
                break;
            case 7:
                dayName = "Domingo";
                break;
            default:
                dayName = "inexistente ";
        }
        System.out.println("El dia es " + dayName);
    }
}
