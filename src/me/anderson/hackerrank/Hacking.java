/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.anderson.hackerrank;

import java.util.*;
/**
 *
 * @author anderson
 */
public class Hacking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Matrix size
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int pds = primaryDiagonalSum(a, n);
        int sds = secondaryDiagonalSum(a, n);
        System.out.println(Math.abs(pds-sds));
    }
    
    private static int primaryDiagonalSum(int[][] a, int size){
        int sum = 0;
        for (int i = 0 ; i < size ; i++){
            sum += a[i][i];
        }
        System.err.println("Primary: " + sum);
        return sum;        
    }
    private static int secondaryDiagonalSum(int[][] a, int size){
        int sum = 0;
        int row = size-1; // begins with 2 if size = 3
        int line = 0; // first line
        for (; line < size ; row--, line++){
            sum += a[line][row];  
        }
        
        System.err.println("Secondary: " + sum);
        return sum;
    }    
}
