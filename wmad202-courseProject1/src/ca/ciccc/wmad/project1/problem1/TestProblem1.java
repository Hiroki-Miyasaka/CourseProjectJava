package ca.ciccc.wmad.project1.problem1;

import java.util.Arrays;

public class TestProblem1 {
    public static void test(){
        int[] n = new int[]{2,6,6,6,3,7,5,8,9,8};
        Peaks p = new Peaks(n, n.length);
        p.test();
        Valleys v = new Valleys(n, n.length);
        v.test();
    }

}
