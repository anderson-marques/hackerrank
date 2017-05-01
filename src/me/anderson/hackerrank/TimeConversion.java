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
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        System.out.println(solve(time));
    }

    private static String solve(final String time) {
        if (time.endsWith("PM")){
            String hour = time.substring(0,2);
            hour = hour.replace("01","13");            
            hour = hour.replace("02","14");            
            hour = hour.replace("03","15");            
            hour = hour.replace("04","16");            
            hour = hour.replace("05","17");            
            hour = hour.replace("08","18");            
            hour = hour.replace("07","19");            
            hour = hour.replace("08","20");            
            hour = hour.replace("09","21");            
            hour = hour.replace("10","22");            
            hour = hour.replace("11","23");
            return hour + time.substring(2,8);
        } else {
            String hour = time.substring(0,2);
            hour = hour.replace("12","00");            
            return hour + time.substring(2,8);
        }
    }
}
