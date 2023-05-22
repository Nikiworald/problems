package com.haemimont.problems.core.solutions;

public class TwoDimensionalArrayProblem {

    public static void minSumInTwoDimensionalArray(int[][] twoDArray) {
        int columns = twoDArray[0].length;
        int rows = twoDArray.length;
        System.out.println(columns+"/"+rows);
        for(int y=rows-1;y>-1;y--){
            for(int x=columns-1;x>-1;x--){
                int numberUnder =0;
                int numberInFront =0;
                if(x<columns-1){
                    numberInFront = twoDArray[y][x+1];
                }if(y<rows-1){
                    numberUnder= twoDArray[y+1][x];
                }
                twoDArray[y][x] = twoDArray[y][x] + Math.min(numberUnder, numberInFront);

//               for (int[] ints : twoDArray) { for debugging
//
//                   // Loop through all elements of current row
//                   for (int anInt : ints) {
//                       System.out.print(anInt + " ");
//                   }
//                   System.out.println();
//               }
            }
        }
        System.out.println(twoDArray[0][0]);
    }

}