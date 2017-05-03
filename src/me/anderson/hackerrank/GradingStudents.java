package me.anderson.hackerrank;

import java.util.Scanner;

/**
 * Created by anderson on 03/05/17.
 */
public class GradingStudents {
    static int[] solve(int[] grades){
        for (int i = 0 ; i < grades.length ; i++){
            int grade = grades[i];
            int diff = (5 - (grade % 5));
            grades[i] = grade >= 38 && diff < 3 ? grade + diff : grade;
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
