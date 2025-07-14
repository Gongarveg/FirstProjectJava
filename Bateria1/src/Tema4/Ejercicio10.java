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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Esta aplicacion sirve para saber cual es tu horoscopo");
        System.out.println("Escribe tu dia de nacimiento y el mes en el numerode dia del anio, por ejemplo: el 27 de DIC seria el dia 361. ");
        int dayYear = s.nextInt();
        String sign = "";
        
        
        
        if (dayYear > 1 && dayYear < 19 ) {
            sign = "Tu signo es Capricornio";
        }
        else if (dayYear > 356 && dayYear < 365 ) {
            sign = "Tu signo es Capricornio";
        }
        else if (dayYear > 20 && dayYear < 49 ) {
            sign = "Tu signo es Acuario";
        }
        else if (dayYear > 50 && dayYear < 79 ) {
            sign = "Tu singo es Piscis";
        }
        else if (dayYear > 80 && dayYear < 109 ) {
            sign = "Tu singo es Aries";
        }
        else if (dayYear > 110  && dayYear < 140 ) {
            sign = "Tu singo es Tauro";
        }
        else if (dayYear > 141 && dayYear < 171 ) {
            sign = "Tu singo es Geminis";
        }
        else if (dayYear > 172 && dayYear < 203 ) {
            sign = "Tu singo es Cancer";
        }
        else if (dayYear > 204 && dayYear < 234 ) {
            sign = "Tu singo es Leo";
        }
        else if (dayYear > 235 && dayYear < 265 ) {
            sign = "Tu singo es Virgo";
        }
        else if (dayYear > 266 && dayYear < 295 ) {
            sign = "Tu singo es Libra";
        }
        else if (dayYear > 296 && dayYear < 325 ) {
            sign = "Tu singo es Escropio";
        }
        else if (dayYear > 326 && dayYear < 355 ) {
            sign = "Tu singo es Sagitario";
        }
        else if (dayYear > 366 || dayYear < 1) {
            sign = "Este dia del anio no existe";
        }
        System.out.println(sign);
        
        
    }
}
