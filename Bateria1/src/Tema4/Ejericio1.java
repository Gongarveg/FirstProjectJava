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
public class Ejericio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe el dia de la semana: ");
        String day = s.nextLine();
        String signature = "";

        switch (day) {
            case "lunes":
                signature = "matematicas";
                break;
            case "martes":
                signature = "lengua";
                break;
            case "miercoles":
                signature = "ingles";
                break;
            case "jueves":
                signature = "jueves";
                break;
            case "viernes":
                signature = "viernes";
                break;
            default:
                signature = "el dia no es valido o no existe";
                break;
        }

        System.out.printf("El dia: " + day + "\nAsignatura: " + signature);
        System.out.println("");
    }
}
