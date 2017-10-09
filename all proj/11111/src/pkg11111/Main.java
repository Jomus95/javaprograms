/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11111;

import java.util.Arrays;

/**
 *
 * @author Jomus
 */
public class Main {

   package demo;

/**
 *
 * @author Jomus
 */


public class Demo1p1 {

    /**
     * @param args the command line arguments
     */
 

    /**
     * Задача 1.2
     * Метод возвращает сумму всех элементов масива,
     * в случае если масив пустой - вернётся 0.
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i<array.length; i++){
            array[i] = (int) MyMath.random(-100, 100);
        }
        System.out.println(Arrays.toString(array));
    }


}

    
}
