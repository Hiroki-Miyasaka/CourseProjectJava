package ca.ciccc.wmad.project1.problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class TestProblem1 {
    public void ToArray(String s) throws FileNotFoundException {
        String[] numbers = s.split(",");
        int[] ArrayNumbers = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            ArrayNumbers[i] = Integer.parseInt(numbers[i]);
        }
        Peaks p = new Peaks(ArrayNumbers, ArrayNumbers.length);
        p.test();
        Valleys v = new Valleys(ArrayNumbers, ArrayNumbers.length);
        v.test();
    }
    public void ReadFile() throws FileNotFoundException {
        File file = new File("/Users/miyasakahiroki/CourseProject/wmad202-courseProject1/src/ca/ciccc/wmad/project1/problem1/castles.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            s = s.replace("[", "");
            s = s.replace("]", "");
            ToArray(s);
        }
    }
    public void test() throws FileNotFoundException {
        ReadFile();
        //int[] n = new int[]{2,6,6,6,3};
        //peak p = new peak(n, n.length);
        //p.Test();
        //valley v = new valley(n, n.length);
        //v.Test();
    }





}
