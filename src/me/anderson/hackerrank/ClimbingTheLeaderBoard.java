package me.anderson.hackerrank;

import java.util.*;

/**
 * Created by anderson on 01/05/17.
 */
public class ClimbingTheLeaderBoard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeSet<Integer> scoresSet = new TreeSet<>(Collections.reverseOrder());
        for (int scores_i = 0; scores_i < n; scores_i++) {
            scoresSet.add(in.nextInt());
        }
        int m = in.nextInt();
        Integer[] a = new Integer[m];
        for (int alice_i = 0; alice_i < m; alice_i++) {
            a[alice_i] = in.nextInt();
        }
        Integer[] scoresArray = scoresSet.toArray(new Integer[scoresSet.size()]);
        for (int alice_i = 0; alice_i < m; alice_i++) {
            int aliceScore = a[alice_i];
            if (scoresSet.first() < aliceScore) {
                System.out.println(1);
            } else if (scoresSet.last() > aliceScore){
                System.out.println(scoresSet.size() + 1);
            } else {
                int index = Arrays.binarySearch(scoresArray, aliceScore, Comparator.reverseOrder());
                index = index < 0 ? index * -1 : index + 1;
                System.out.println(index);
            }
        }
    }
}
