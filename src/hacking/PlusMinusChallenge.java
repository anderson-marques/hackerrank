/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacking;

import java.util.Scanner;

/**
 *Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeroes in the array compared to its size.
Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667
Explanation

There are  positive numbers,  negative numbers, and  zero in the array. 
The respective fractions of positive numbers, negative numbers and zeroes are , and , respectively.
 */
public class PlusMinusChallenge {
    
    public float positiveFraction = 0.0f;
    public float negativeFraction = 0.0f;
    public float zeroFraction = 0.0f;
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int arraySize = Integer.parseInt(in.nextLine());        
        int arrayOfNumbers[] = new int[arraySize];
        String[] numbers = in.nextLine().split(" ");
        for(int i=0 ; i < arraySize; i++){
            arrayOfNumbers[i] = Integer.parseInt(numbers[i]);
        }
        
        PlusMinusChallenge challenge = new PlusMinusChallenge();
        challenge.solve(arraySize, arrayOfNumbers);
    }

    private void solve(int n, int[] arr) {
        for (int i = 0 ; i < n ; i ++){
            if (arr[i] == 0){
                zeroFraction++;
            } else if (arr[i] > 0){
                positiveFraction++;
            } else {
                negativeFraction++;
            }
        }
        
        System.out.println( positiveFraction / n);
        System.out.println( negativeFraction / n);
        System.out.println( zeroFraction / n);
    }
    
}
