/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioarray;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alber
 */

public class Ej07 {
    
    public static int mult;
    public static Random r = new Random();
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc=new Scanner(System.in);
        int valores ;
        
        
        System.out.println("¿Cual es la longitud del array?");
        valores=sc.nextInt();
        
        int [] array1=new int[valores];
        int [] array2=new int[valores];
        int [] multipl= new int[valores];
       
        for (int i = 0; i < array1.length; i++) {
            array1[i]=r.nextInt(100)+1;
            System.out.println(array1);
        }
        
        for (int j = 0; j < array2.length; j++) {
            array2[j]=r.nextInt(100) + 1;
        }
        multiplicacion(array1,array2);
        
         for (int p = 0; p < array2.length; p++) {
            int mult = 0;
            array2[p]=mult;
        }
    }
  
    public static void multiplicacion(int [] array1,int [] array2){
         for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
           int mult=array1[i]*array2[j];
                System.out.println("Los resultados son: " + mult);
               
            }
        
    }
        
         
     
    }
}
