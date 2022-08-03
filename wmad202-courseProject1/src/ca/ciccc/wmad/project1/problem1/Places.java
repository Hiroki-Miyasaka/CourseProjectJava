package ca.ciccc.wmad.project1.problem1;

public abstract class Places implements Place{
    public int[] n;
    public int nCastles;

    public Places(int[] n, int nCastles){
        this.n = n;
        this.nCastles = nCastles;
    }

    @Override
    public int[] findNumbers(int[] n, int nSize){
        return new int[0];
    }

    @Override
    public int castlesNumbers(int[] n){
        return 0;
    }

}
