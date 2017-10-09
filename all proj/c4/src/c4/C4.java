/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c4;

/**
 *
 * @author Jomus
 */
public class C4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1=3;
        int n2=9;
        int s;
        int p;
        int i;
        for (i=n1; i<=n2;i++){
        s= s+i;
        p= p*i;
        System.out.println("S = "+s+"P = "+p);
        }
    }
    
}
