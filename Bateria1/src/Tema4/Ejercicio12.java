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
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa es un cuestionario sobre las diferentes asignaturas del curso.");
        int note = 0;
        
        //Esto son las preguntas
        String q1 = "Lengua: Que es una palabra parasintetica?: ";
        String q2 = "Mates: Cual es la formula del area del cuadrado?: ";
        String q3 = "Ingles: Diferentes formas del verbo to be?: ";
        String q4 = "Robotica: Que es el Big Data?: ";
        String q5 = "Historia: Quien era alejandro Magno?: ";
        
        //Esto es para responder a las preguntas
        System.out.print(q1);
        String a1 = s.nextLine();

        System.out.print(q2);
        String a2 = s.nextLine();

        System.out.print(q3);
        String a3 = s.nextLine();

        System.out.print(q4);
        String a4 = s.nextLine();

        System.out.print(q5);
        String a5 = s.nextLine();
        
        //Esto comprueba que las respuestas esten bien
        if (a1.equals("Es una palabra que si le quitas el prefijo o el sufijo ya no tiene sentido")) {
            note = note + 2;
        }
        if (a2.equals("l*l")) {
            note = note + 2;
        }
        if (a3.equals("Be, was/were, been")) {
            note = note + 2;
        }
        if (a4.equals("Es un conjunto de datos masivo")) {
            note = note + 2;
        }
        if (a5.equals("Fue el macedonio que consquisto toda Asia")) {
            note = note + 2;
        }
        System.out.println("Tu nota es: " + note + ".");

    }
}
