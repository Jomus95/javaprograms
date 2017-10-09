/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22222;
import java.util.Arrays;
/**
 *
 * @author Jomus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i<array.length; i++){
            array[i] = (int) MyMath.random(-100, 100);
        }
        System.out.println(Arrays.toString(array));
    }
    
}
