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
public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Esta aplicacion sirve para calcular la nota necesaria en tu examen para la nota del trimestre deseada");

        Scanner s = new Scanner(System.in);

        System.out.print("Escribe la nota deseada en el trimestre: ");
        double notaTrimestre = s.nextDouble();

        System.out.print("Escribe la nota de tu primer examen: ");
        double nota1 = s.nextDouble();

        // Cálculo correcto de la nota necesaria en el segundo examen
        double nota2 = (notaTrimestre - (nota1 * 0.4)) / 0.6;

        // Mostrar directamente el resultado
        System.out.println("Tienes que sacar un " + nota2 + " en el segundo examen para lograr un " + notaTrimestre + " en el trimestre.");

        s.close();
    }
}
