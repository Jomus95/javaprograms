/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SecondTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long m = Long.parseLong(br.readLine());
        System.out.println(solve(n,m));
    }
    public static long factorial(long m){
        long ret = 1;
        for (long i = 1; i <= m; i++)
            ret *= i;
        return ret;
    }
    public static long mod(long n) {
        long result = 0;
        for (long m = 0; m <= n; m++) {
            if (factorial(m) % n == 0) {
                result = m;
                break;
            }
        }
        return result;
    }
    public static long solve(long n, long m){
        long result = 0;
        for (long i = n; i <= m; i++)
            result += mod(i);
        return result;
    }
}

