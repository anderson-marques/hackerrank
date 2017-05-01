/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacking;

import java.util.Scanner;

/**
 *
 * @author anderson
 */
public class EletronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        if (s == 0) return -1;
        
        int[] combosValues = new int[keyboards.length * drives.length];
        int combosCount = 0;
        for (int i = 0; i < keyboards.length; i++){
            for (int j = 0; j < drives.length; j++){
                combosValues[combosCount++] = keyboards[i] + drives[j];
            }
        }
        
        int choosenComboValue = -1;
        for (int k = 0; k < combosCount; k++){
            choosenComboValue = combosValues[k] <= s && combosValues[k] > choosenComboValue ? combosValues[k] : choosenComboValue;
        }
        
        return choosenComboValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
