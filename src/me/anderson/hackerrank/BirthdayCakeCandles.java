/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.anderson.hackerrank;

import java.util.Scanner;

/**
 *
 * @author anderson
 */
public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int candles = in.nextInt();
        int height[] = new int[candles];
        int maxHeight = Integer.MIN_VALUE;
        int maxCandlesBlowsCount = 0;
        for (int i = 0; i < candles; i++) {
            height[i] = in.nextInt();
            if (height[i] > maxHeight){
                maxCandlesBlowsCount = 1;
                maxHeight = height[i];
            } else if (height[i] == maxHeight){
                maxCandlesBlowsCount++;
            }
        }
        System.out.println(maxCandlesBlowsCount);
    }
}
