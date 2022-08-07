package ca.ciccc.wmad.project2.main;

import ca.ciccc.wmad.project2.problem2.TestProblem2;

import java.io.FileNotFoundException;

public class Project2Driver {
    public static void run() throws FileNotFoundException {
        TestProblem2 t = new TestProblem2();
        t.test();
    }
}
