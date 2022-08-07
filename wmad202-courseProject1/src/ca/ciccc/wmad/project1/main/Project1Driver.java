package ca.ciccc.wmad.project1.main;

import ca.ciccc.wmad.project1.problem1.TestProblem1;

import java.io.FileNotFoundException;

public class Project1Driver {

    public static void run() throws FileNotFoundException {
        TestProblem1 t = new TestProblem1();
        t.test();
    }
}
