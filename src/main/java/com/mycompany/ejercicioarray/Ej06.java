/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioarray;

/**
 *
 * @author alber
 */
public class Ej06 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array1 = {1, 2, 3};
        verificar(array, array1);

    }

    public static boolean verificar(int[] array, int[] array1) {
        boolean encuentra = false;
        for (var i = 0; i < array.length; i++) {
            encuentra = false;
            for (var j = 0; j < array1.length; j++) {
                if (array[i] == array1[j]) {
                    encuentra = true;
                    break;
                }
            }
            if (encuentra != true) {
                System.out.println("los arreglos no son iguales");
                break;
            }
        }
        if (encuentra == true) {
            System.out.println("si son iguales");
        }
        return false;
    }

}
