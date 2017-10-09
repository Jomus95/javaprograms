/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c9;

/**
 *
 * @author Jomus
 */
public class C9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double s=0; int d;
        for (int i =0; i <100; i=i+3){
        s=Math.sqrt(s+ Math.sqrt(s+Math.sqrt(i)));
        }
        System.out.println(s);
// TODO code application logic here
    }
    
}
