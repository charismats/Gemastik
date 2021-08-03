package com.pemanasan11;

import java.util.Scanner;

public class SultanDermawan {

    static int fakt(int n){
        if( n <= 1)
            return 1;
        int [] dp = new int[n+1];
        dp[0] = dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = i * dp[i-1];
        }
        return dp[n];
    }
    static int permute(int n, int k){
        return fakt(n) / (fakt(n-k));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] data = line.split(" ");
        int[] n = new int[data.length];
        for(int i = 0; i < n.length; i++){
            n[i] = Integer.parseInt(data[i]);
        }
        int sum = 0;
        for(int i : n){
            sum += i;
        }
        int num = fakt(sum);
        int denom = 1;
        for(int i : n){
            denom *= fakt(i);
        }

        int result = num / denom;
        System.out.println(result);

    }
}
