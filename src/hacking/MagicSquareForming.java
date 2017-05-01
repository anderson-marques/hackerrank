/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anderson
 */
public class MagicSquareForming {

    private static int calculateCost(int[][] s, int[][] solution) {
        int cost = 0;
        for (int i=0; i < s.length; i++){
            for (int j=0; j < s.length; j++){
                if (solution[i][j] != s[i][j]){
                    cost += Math.abs(solution[i][j] - s[i][j]);
                }
            }
        }
        
        return cost;
    }

    public static void main(String[] args) {
        int[][] solution1 = new int[][]{{8,1,6}, {3,5,7}, {4,9,2}};
        int[][] solution2 = new int[][]{{6,1,8}, {7,5,3}, {2,9,4}};
        int[][] solution3 = new int[][]{{8,3,4}, {1,5,9}, {6,7,2}};
        int[][] solution4 = new int[][]{{6,7,2}, {1,5,9}, {8,3,4}};
        int[][] solution5 = new int[][]{{4,3,8}, {9,5,1}, {2,7,6}};
        int[][] solution6 = new int[][]{{2,7,6}, {9,5,1}, {4,3,8}};
        int[][] solution7 = new int[][]{{4,9,2}, {3,5,7}, {8,1,6}};
        int[][] solution8 = new int[][]{{2,9,4}, {7,5,3}, {6,1,8}};
        
        List<int[][]> solutions = new ArrayList<int[][]>();
        
        solutions.add(solution1);
        solutions.add(solution2);
        solutions.add(solution3);
        solutions.add(solution4);
        solutions.add(solution5);
        solutions.add(solution6);
        solutions.add(solution7);
        solutions.add(solution8);
        
        Scanner in = new Scanner(System.in);

        int[][] s = new int[3][3];
        for (int s_i = 0; s_i < 3; s_i++) {
            for (int s_j = 0; s_j < 3; s_j++) {
                s[s_i][s_j] = in.nextInt();
            }
        }
        
        int minorCost = Integer.MAX_VALUE;
        
        for (int[][] solution : solutions){
            int cost = calculateCost(s, solution);
            minorCost = minorCost > cost ? cost : minorCost;
        }
        
        System.out.println(minorCost);
    }
}
