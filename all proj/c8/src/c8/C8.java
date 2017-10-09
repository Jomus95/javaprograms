/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c8;

/**
 *
 * @author Jomus
 */
public class C8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a=3.5;
       int n=5;
       double s=0;
       for (int i=0; i<n;i++){
       s=s+ Math.exp(Math.log(a)*i);
       }
       System.out.println(s);
        
// TODO code application logic here
    }
    
}
