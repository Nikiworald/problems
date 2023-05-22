package com.haemimont.problems.core.main;

import com.haemimont.problems.core.generator.Generator;
import com.haemimont.problems.core.solutions.TwoDimensionalArrayProblem;

public class Main {
    public static void main(String[] args) {
        int[][] twoDArray = Generator.generateMatrix(10,10);
        TwoDimensionalArrayProblem.minSumInTwoDimensionalArray(twoDArray);

    }
}
