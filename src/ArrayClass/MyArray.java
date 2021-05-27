package ArrayClass;

import java.util.Arrays;

public class MyArray<T> {
    private T[] arrayData; // its set to generic array data this way anything can be stored
    public int length; // what is length of the array.
    private int maxItems; // how many max items will be allowed here

    public MyArray(int maxItems) {
        this.maxItems = maxItems;
        this.length = 0;
        arrayData = (T[]) new Object[maxItems];
    }
    public T getIndex(int index){
        return arrayData[index-1];
    }
    public void Push(T item){
        arrayData[length]=item;
        this.length++;
    }
    public void Pop(){
        var lastItem = this.arrayData[this.length-1]; // this will hold the value for the item
        this.arrayData[this.length-1]= (T)new Object(); // this way object will be cased to
        this.length --;
        System.out.println("Element in the array is "+ Arrays.toString(arrayData));

    }

    public void printItems(){
        System.out.println("Items in the array");
        for (int i = 0; i <length ; i++) {
            System.out.println(arrayData[i]);
        }
        System.out.println("");
    }




    public void Delete(int index){
         index-=1;
        for (int i = index; i <this.length-1 ; i++) {

            this.arrayData[i] = this.arrayData[i+1]; // shift it
        }

        this.length--;
    }



}
