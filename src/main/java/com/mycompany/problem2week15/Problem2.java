/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.problem2week15;

/**
 *
 * @author soblab
 */
public class Problem2 {
    static int getSum(int n){
        int sum=0;
        for (int i = 0; i <= 10; i++) 
            if(i%2==0) sum+=i;  
        return sum;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("evens 0 to "+n+": "+getSum(n));
    }
}
