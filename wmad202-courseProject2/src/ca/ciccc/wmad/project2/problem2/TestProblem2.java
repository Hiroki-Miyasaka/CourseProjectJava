package ca.ciccc.wmad.project2.problem2;

public class TestProblem2 {

    public static void test(){
        Transformer a = new Transformer("Optimus Prime","a",4,5,5,3,2,9,9,1);
        Transformer d = new Transformer("d","d",1,2,3,4,5,2,7,8);
        Battle b = new Battle(a, d);
        System.out.println(b.compareToCourageAndStrength());
        System.out.println(b.compareToSkill());
        System.out.println(b.compareToOverAllRating());
        System.out.println(b.specialRules());

    }
}
