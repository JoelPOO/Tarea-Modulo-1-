

package com.mycompany.arreglo2;


public class Arreglo2 {

    public static void main(String[] args) {
        String[][] compañeros = new String[5][4];

        // Ingresar los datos de las personas
        compañeros [0][0] = "Diego";
        compañeros [0][1] = "Péña";
        compañeros [0][2] = "Gildan";
        compañeros [0][3] = "Ingeniería Industril";

        compañeros [1][0] = "Cindy ";
       compañeros [1][1] = "Salinas";
        compañeros [1][2] = "SEL";
        compañeros [1][3] = "Ingenieria Indutrial";

        compañeros [2][0] = "Sarita";
       compañeros [2][1] = "Li";
        compañeros [2][2] = "Hospital del valle";
        compañeros [2][3] = "Ingenieria Indutrial";

        compañeros [3][0] = "Luis";
        compañeros [3][1] = "Reyes";
        compañeros [3][2] = "Caracoll";
      compañeros [3][3] = "Ingenieria electronica";

       compañeros [4][0] = "Luis";
       compañeros [4][1] = "Aleman";
        compañeros [4][2] = "TIGO";
       compañeros [4][3] = "Ingenieria Industrial";

        // Imprimir los datos de las personas
        for (int i = 0; i < compañeros .length; i++) {
            System.out.println("Compañero " + (i + 1) + ":");
            System.out.println("Nombre: " + compañeros [i][0]);
            System.out.println("Apellido: " + compañeros [i][1]);
            System.out.println("Lugar de trabajo: " + compañeros [i][2]);
            System.out.println("Carrera: " +compañeros [i][3]);
            System.out.println();
        }
    }
}


   
/*
Diego Peña
Cindy Salinas
Sarita Li
Luis Aleman
Luis Reyes
Joel Sarmiento
Jose Lopes
Carlos Estrada
Elbin Mendez
Aminta erazo



*/