package com.haemimont.problems.core.generator;

import java.util.concurrent.ThreadLocalRandom;

public class Balls {
    private static int breakingHeight = 0;
    public static void newBreakingHeight(int bound){
        breakingHeight = ThreadLocalRandom.current().nextInt(0,bound);
    }
    public static boolean DropFrom(int floor){
       boolean check = false;
        int i = breakingHeight;
        if(floor>i){check=true;}
       return check;
    }
    public static int definitelyNotTheBreakingHeight(){
        return breakingHeight;
    }
}
