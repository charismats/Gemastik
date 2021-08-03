package com.pemanasan10;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class KuratorMuseum{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] sorted = new int[N];
        for(int i = 0; i < N ; i++){
            arr[i] = sc.nextInt();
            sorted[i] = arr[i];
        }
        Arrays.sort(sorted);
        for(int i = 0, j = N-1; i <= N/2 ; i++){
           if( arr[i] == sorted[i]){
               //tukar sama belakang
               int temp = sorted[i];
               sorted[i] = sorted[j];
               sorted[j] = temp;
               j--;

           }
        }

        for(int n : sorted){
            System.out.print(n + " ");
        }
        System.out.println();

    }
}