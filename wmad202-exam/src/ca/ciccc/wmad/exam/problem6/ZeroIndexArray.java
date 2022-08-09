package ca.ciccc.wmad.exam.problem6;

public class ZeroIndexArray {

    private int[] items;

    public ZeroIndexArray(int[] items) {
        this.items = items;
    }

    public int[] preIndex(int index){
        int[] array = new int[index];
        for(int i = 0; i < index; i++){
            array[i] = items[i];
        }
        return array;
    }

    public int[] postIndex(int index){
        int size = items.length - index;
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = items[i + index];
            }

        return array;
    }

    public int maxArray(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public Integer difference(int index){

        int[] preIndexArray = this.preIndex(index);
        int preMax = this.maxArray(preIndexArray);
        int[] postIndexArray = this.postIndex(index);
        int postMax = this.maxArray(postIndexArray);
        int deffirent = preMax - postMax;
        return deffirent;
    }

    public int findIndexForMaximumDifference(){
        int max = difference(0);
        for(int i = 1; i < items.length; i++){
            if(max < difference(i)){
                max = difference(i);
            }
        }
        return max;
    }
}
