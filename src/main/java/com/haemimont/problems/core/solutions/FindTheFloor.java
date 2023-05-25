package com.haemimont.problems.core.solutions;

import com.haemimont.problems.core.generator.Balls;

public class FindTheFloor {
    public static int solve(int n) {
        Balls.newBreakingHeight(n);
        int i = 0;
        int iterCnt = 0;
        int guess = 0;
        while (i < n) {
            if (!Balls.DropFrom(i)) {
                i += 2;
                iterCnt ++;
                guess = i;
            } else {
                i--;
                guess = i;
                iterCnt++;
                if (Balls.DropFrom(i)) {
                    guess = i - 1;
                }
                break;
            }
        }


        System.out.println(iterCnt);
        return guess;
    }


}
