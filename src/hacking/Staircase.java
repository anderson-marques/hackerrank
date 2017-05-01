/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacking;

import java.util.Scanner;

/**
 Consider a staircase of size :

   #
  ##
 ###
####
Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

Input Format

A single integer, , denoting the size of the staircase.

Output Format

Print a staircase of size  using # symbols and spaces.

Note: The last line must have  spaces in it.


 * @author anderson
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stairs = in.nextInt();
        
        for (int stair = stairs ; stair > 0 ; stair--){
            int spaces = stair - 1;
            int hashes = stairs - spaces;
            for (int i = 0; i < spaces; i++){
                System.out.print(" ");
            }
            for (int i = 0; i < hashes; i++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
