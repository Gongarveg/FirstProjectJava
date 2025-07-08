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
        int dayMonth = s.nextInt();
        String sign = "";
        
        
        
        if (dayMonth > 1 && dayMonth < 19 ) {
            sign = "Tu signo es Capricornio";
        }
        else if (dayMonth > 356 && dayMonth < 365 ) {
            sign = "Tu signo es Capricornio";
        }
        else if (dayMonth > 20 && dayMonth < 49 ) {
            sign = "Tu signo es Acuario";
        }
        else if (dayMonth > 50 && dayMonth < 79 ) {
            sign = "Tu singo es Piscis";
        }
        else if (dayMonth > 80 && dayMonth < 109 ) {
            sign = "Tu singo es Aries";
        }
        else if (dayMonth > 110  && dayMonth < 140 ) {
            sign = "Tu singo es Tauro";
        }
        else if (dayMonth > 141 && dayMonth < 171 ) {
            sign = "Tu singo es Geminis";
        }
        else if (dayMonth > 172 && dayMonth < 203 ) {
            sign = "Tu singo es Cancer";
        }
        else if (dayMonth > 204 && dayMonth < 234 ) {
            sign = "Tu singo es Leo";
        }
        else if (dayMonth > 235 && dayMonth < 265 ) {
            sign = "Tu singo es Virgo";
        }
        else if (dayMonth > 266 && dayMonth < 295 ) {
            sign = "Tu singo es Libra";
        }
        else if (dayMonth > 296 && dayMonth < 325 ) {
            sign = "Tu singo es Escropio";
        }
        else if (dayMonth > 326 && dayMonth < 355 ) {
            sign = "Tu singo es Sagitario";
        }
        else if (dayMonth > 366 || dayMonth < 1) {
            sign = "Este dia del anio no existe";
        }
        System.out.println(sign);
        
        
    }
}
