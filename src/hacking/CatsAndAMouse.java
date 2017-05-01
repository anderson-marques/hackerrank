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
public class CatsAndAMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int catA = in.nextInt();
            int catB = in.nextInt();
            int mouseC = in.nextInt();
            if (Math.abs(mouseC - catA) < Math.abs(mouseC - catB)) {
                System.out.println("Cat A");
            } else if (Math.abs(mouseC - catA) > Math.abs(mouseC - catB)) {
                System.out.println("Cat B");
            } else {
                System.out.println("Mouse C");
            }
        }

    }
}
