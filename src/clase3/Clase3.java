/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author v
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Scanner leer = new Scanner(System.in);
//
//        System.out.println("ingrese filas");
//        int filas = leer.nextInt();
//        System.out.println("ingrese columnas");
//        int columnas = leer.nextInt();
//
//        System.out.println("ingrese n");
//        int n = leer.nextInt();
//
//        int[][] matrix = new int[filas][columnas];
//
//        int cont = 1;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = cont * n;
//                cont++;
//                ;
//
//            }
//
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print("[" + matrix[i][j] + "]");
//            }
//            System.out.println();
//        }
//
//        
        System.out.println("ej_1");
        
        int  suma=0;
        
        for (int i = 1; i < 4; i++) {
            for (int j = 3; j >= 0; j--) {
                suma=(i*10+j);
                System.out.println(suma);
            }
            
        }
        
    
        
        
        
    }

}
