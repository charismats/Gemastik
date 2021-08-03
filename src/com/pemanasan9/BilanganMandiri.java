package com.pemanasan9;

import java.util.Scanner;

public class BilanganMandiri {
    static boolean isPrime(int n ){
        if( n <= 1)
            return false;
        for(int i = 2; i < n ; i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] A = new int[N]; 
        int [] B = new int[N];
        for(int i = 0; i < N ; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        for(int i = 0 ; i < N ; i++){
            int countPrime = 0;
            for(int n = A[i]+1 ; n <= B[i]; n++){
                if( isPrime(n) )
                    countPrime++;
            }
            System.out.println(countPrime);
        }
    }
}
