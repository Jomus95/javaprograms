/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c7;

/**
 *
 * @author Jomus
 */
public class C7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] multiplyTab  = new int[10][10];

for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
        multiplyTab[i][j] = (i+1)*(j+1);
        //вывод ряда чисел разделенных знаком табуляции
       	System.out.print(multiplyTab[i][j] + "\t");
   }
   System.out.println();
}
// TODO code application logic here
    }
    
}
