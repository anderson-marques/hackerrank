/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.anderson.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anderson
 */
public class PickingNumbers {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Validate array size constraint
        if (!(2 <= n && n <= 100)){
            throw new RuntimeException("Invalid array size");
        }

        Integer[] a = new Integer[n];
        for (int i = 0; i < n ; i++){
            a[i] = in.nextInt();
        }
        // Validate array values constraint
        for (int i = 0; i < a.length; i++){
            if (!(0 < a[i] && a[i] < 100)){
                throw new RuntimeException("Invalid array value");
            }
        }

        int maxNumbers = Integer.MIN_VALUE;
        List<Integer> validList = new ArrayList<>();
        for (int i = 0; i < a.length ; i++) {
            validList.clear();
            for (int j = 0; j < n ; j++) {
                if (a[j] == a[i] + 1 || a[j] == a[i]){
                    validList.add(a[j]);
                }
            }
            maxNumbers = maxNumbers < validList.size() ? validList.size() : maxNumbers;

            validList.clear();
            for (int j = 0; j < n ; j++) {
                if (a[j] == a[i] - 1 || a[j] == a[i]){
                    validList.add(a[j]);
                }
            }
            maxNumbers = maxNumbers < validList.size() ? validList.size() : maxNumbers;
        }

        System.out.println(maxNumbers);
    }
}
