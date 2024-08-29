

package com.mycompany.repetitivas;

import java.util.Scanner;


public class Repetitivas {

    public static void main(String[] args) {
        
   // declaracion
   int vector [] = new int [4];
   
   Scanner teclado = new Scanner (System.in);
   for (int i=0; i<vector.length;i++) {
       System.out.println("Ingrese el valor para el indice: " + i);
       vector[i] = teclado.nextInt();
    }
   for (int i=0; i<vector.length;i++) {
       System.out.println("estoy en el indice: " + i);
       System.out.println("tengo guardo un: " + vector[i]);
       System.out.println("------------------------------");
   
   }
   }
}
