/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brojdelioca;

import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author admin
 */
public class BrojDelioca {
    static int divCount(int n)
{
    // sieve method for prime calculation
    boolean hash[] = new boolean[n + 1];
    Arrays.fill(hash, true);
    for (int p = 2; p * p < n; p++)
        if (hash[p] == true)
            for (int i = p * 2; i < n; i += p)
                hash[i] = false;
  // Traversing through 
    // all prime numbers
    int total = 1;
    for (int p = 2; p <= n; p++) 
    {
        if (hash[p])
        {
  
            // calculate number of divisor
            // with formula total div = 
            // (p1+1) * (p2+1) *.....* (pn+1)
            // where n = (a1^p1)*(a2^p2).... 
            // *(an^pn) ai being prime divisor
            // for n and pi are their respective 
            // power in factorization
            int count = 0;
            if (n % p == 0) 
            {
                while (n % p == 0) 
                {
                    n = n / p;
                    count++;
                }
                total = total * (count + 1);
            }
        }
    }
    return total;
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = 24;
        System.out.println(divCount(n));
    }
    
}
