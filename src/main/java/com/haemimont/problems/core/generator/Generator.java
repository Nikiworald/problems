package com.haemimont.problems.core.generator;

import java.util.concurrent.ThreadLocalRandom;

public class Generator {
    public static int[][] generateMatrix(int m, int n) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = ThreadLocalRandom.current().nextInt(0, 100);
            }
        }
        return result;
    }
}
