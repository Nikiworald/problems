package com.haemimont.problems.core.main;

import com.haemimont.problems.core.generator.Balls;
import com.haemimont.problems.core.solutions.FindTheFloor;

public class Main {
    public static void main(String[] args) {
//        int[][] twoDArray = Generator.generateMatrix(10, 10);
//
//        for (int[] ints : twoDArray) {      //print the matrix
//            for (int anInt : ints) {
//                if(anInt<10){
//                    System.out.print(anInt + "  ");
//                }else {
//                    System.out.print(anInt + " ");
//                }
//            }
//            System.out.println();
//        }
//        TwoDimensionalArrayProblem.minSumInTwoDimensionalArray(twoDArray);
       int i= FindTheFloor.solve(87);
        System.out.println(i+"/"+ Balls.definitelyNotTheBreakingHeight());


    }
}
