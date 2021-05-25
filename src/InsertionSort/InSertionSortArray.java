package InsertionSort;

import java.util.Arrays;

public class InSertionSortArray {
    private int[] arrayData;
    private int numOfItems; // will keep how many items on the array
    private int size; // this wll limiot the array sizes

    public InSertionSortArray(int size) {
        this.size = size;
        this.numOfItems = 0;
        this.arrayData = new int[size];
    }

    public String PrintItems(){
        StringBuilder output = new StringBuilder();
        output.append("here are the list:");
        for (int i = 0; i <numOfItems ; i++) {
            output.append(arrayData[i]).append("\n");
        }
        return output.toString();
    }

    public boolean addItem(int item){
        if(numOfItems>size) return false;
        arrayData[numOfItems] = item;
        numOfItems++;
        return true;
    }

    public void InsertionSortAscending(){

        for (int i = 1; i <numOfItems-1 ; i++) {
            var value = arrayData[i];
            var hole = i;

            while (hole>0 && arrayData[hole-1]>value){
                arrayData[hole] = arrayData[hole-1];
                hole--;
            }
            arrayData[hole] =value;
        }


    }

    public void InsertionSortDecending(){

        for (int i = 1; i <numOfItems-1 ; i++) {
            var value = arrayData[i];
            var hole = i;

            while (hole>0 && arrayData[hole-1]<value){
                arrayData[hole] = arrayData[hole-1];
                hole--;
            }
            arrayData[hole] =value;
        }


    }
}
