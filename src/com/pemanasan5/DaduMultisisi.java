package com.pemanasan5;

import java.util.Scanner;

public class DaduMultisisi {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int[] daduA = new int[6];
        int [] daduB = new int[6];
        int maxA = -1;
        for(int i = 0; i < 6; i++){
            daduA[i] = sc.nextInt();
            if(maxA < daduA[i]) maxA = daduA[i];
        }
        int maxB = -1;
        for(int j = 0; j < 6; j++){
            daduB[j] = sc.nextInt();
            if(maxB < daduB[j]) maxB = daduB[j];
        }

        int [] cntA = new int[maxA+1];
        int[] cntB = new int[maxB+1];
        for(int i = 0; i < 6; i++){
            cntA[daduA[i]]++;
            cntB[daduB[i]]++;
        }
        //count probability
        double[] probA = new double[maxA+1];
        double[] probB = new double[maxB+1];
        for(int i = 0; i < probA.length;i++){
            probA[i] = 1.0 * cntA[i] / 6;
        }
        for(int i = 0; i < probB.length;i++){
            probB[i] = 1.0 * cntB[i] / 6;
        }

        //count menang Adhi
        double menangAdhi = 0.0;
        for(int i = 0; i < probA.length;i++){
            for(int j = 0; j < probB.length; j++){
                if( probA[i] != 0 && probB[j] != 0 && i > j){
                    System.out.println("daduA = "+i + "daduB = "+j);
                    menangAdhi += probA[i] * probB[j];
                }
            }
        }
        //count menang Vijay
        double menangVijay = 0.0;
        for(int i = 0; i < probB.length;i++){
            for(int j = 0; j < probA.length; j++){
                if( probB[i] != 0 && probA[j] != 0 && i > j){
                    menangVijay += probB[i] * probA[j];
                }
            }
        }
        System.out.println("Peluang adhi menang : " + menangAdhi);
        System.out.println("Peluang vijay menang : "+ menangVijay);
        if( menangVijay == menangAdhi){
            System.out.println("Imbang");
        }else if ( menangAdhi > menangVijay){
            System.out.printf("Adhi menang dengan peluang %.2f",(menangAdhi));
        }else{
            System.out.printf("Vijay menang dengan peluang %.2f",(menangVijay));
        }
    }
}
