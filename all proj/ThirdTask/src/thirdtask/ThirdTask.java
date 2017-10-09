/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class ThirdTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("type the interval for a");
        double a1 = Long.parseLong(br.readLine());
        double a2 = Long.parseLong(br.readLine());
        System.out.println("type the interval for b");
        double b1 = Long.parseLong(br.readLine());
        double b2 = Long.parseLong(br.readLine());
        pow(a1, a2, b1, b2);
    }
    public static ArrayList<Double> pow(double a1, double a2, double b1, double b2){
        ArrayList<Double> arr = new ArrayList<>();
        for (double i = a1 + 1; i < a2; i++){
            for (double j = b1 + 1; j < b2; j++){
                arr.add(Math.pow(i,j));
            }
        }
        System.out.println("arr size is " + arr.size());
        HashSet<Double> list = new HashSet<Double>(arr);
        System.out.println("now arr size is " + list.size());
        return arr;
    }
}
