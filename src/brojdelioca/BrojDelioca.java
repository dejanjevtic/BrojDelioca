/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brojdelioca;

import java.util.Arrays;

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
  
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = 24;
        System.out.println(divCount(n));
    }
    
}
