
package com.mycompany.programaestudiantes;

import java.util.Scanner;

public class ProgramaEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();

        System.out.print("Ingrese la nota del estudiante: ");
        int nota = scanner.nextInt();

        String etiqueta;
        if (nota >= 60) {
            etiqueta = "Aprobado";
        } else {
            etiqueta = "Reprobado";
        }

        System.out.println(nombreEstudiante);
        System.out.println(nota);
        System.out.println(etiqueta);
    }
}
