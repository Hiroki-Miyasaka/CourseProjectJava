package ca.ciccc.wmad.project1.problem1;

import java.util.Arrays;

public class Peaks extends Places{

    public Peaks(int[] n, int nCastles){
        super(n, nCastles);
    }

    public void setCastles(int nCastles){
        this.nCastles = nCastles;
    }

    @Override
    public int[] findNumbers(int[] n, int nSize){
        int controller = 0;
        int[] newN = new int[nSize];
        if(nSize == 1){
            newN[0] = n[0];
        } else{
            for(int i = 1; i < nSize; i++){
                if(n[i] >= n[i-1] && n[i] >= n[i + 1]){
                    newN[controller] = n[i];
                    controller++;
                }
            }
        }
        return newN;
    }

    @Override
    public int castlesNumbers(int n[]){
        int result = 0;

        for(int i = 0; i < n.length; i++){
            if(n[i] != 0 && n[i] != n[i + 1]){
                result++;
            }
        }
        return result;
    }

    public void test(){
        System.out.println(Arrays.toString(findNumbers(n, n.length)));
        int[] n2 = findNumbers(n, n.length);
        setCastles(castlesNumbers(n2));
        System.out.println("In this array we can construct" + castlesNumbers(n2) + " castles");
    }
}
