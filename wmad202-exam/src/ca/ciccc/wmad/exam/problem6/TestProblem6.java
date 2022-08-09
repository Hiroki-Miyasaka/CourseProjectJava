package ca.ciccc.wmad.exam.problem6;

public class TestProblem6 {

    public void test(){
        int[] a = {4, 5, 2, 8, -1, -4, 9};

        ZeroIndexArray z = new ZeroIndexArray(a);
        System.out.println(z.preIndex(5));
        System.out.println(z.postIndex(2));
        System.out.println(z.maxArray(a));
        System.out.println(z.difference(3));
        System.out.println(z.findIndexForMaximumDifference());
//        int[] b = z.preIndex(5);
//        for(int i = 0; i < b.length; i++){
//            System.out.println(b[i]);
//        }
    }
}
