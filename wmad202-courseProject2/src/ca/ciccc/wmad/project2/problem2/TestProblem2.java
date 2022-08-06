package ca.ciccc.wmad.project2.problem2;

import java.util.ArrayList;

public class TestProblem2 {

    public static void test(){
        Transformer e = new Transformer("e","a",4,5,5,3,2,9,9,1);
        Transformer q = new Transformer("q","d",1,2,3,4,5,2,7,8);
        Transformer i = new Transformer("i","a",5,8,10,1,34,9,45,7);
        Transformer f = new Transformer("f","d",8,3,2,1,9,3,87,9);
        ArrayList<Transformer> autobots = new ArrayList<Transformer>();
        ArrayList<Transformer> deceptions = new ArrayList<Transformer>();
        autobots.add(e);
        autobots.add(i);
        deceptions.add(q);
        deceptions.add(f);
        Judge j = new Judge(autobots, deceptions);
        j.printInformationOfResult();


    }
}
