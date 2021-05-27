package com.company.ArrayCRUD;

public class OrderedArray<T extends Number & Comparable<T>>
    /*
    // in here T has been extended to Number and Generic to so its can be easily comparable.
                                    // thus this way number can be compared easily with one another.
     */

{
    private final int size; // this is the size of the array how big the array will be .
    private int numOfItems; // this will increment when new items are added.
    private final T[] m_array; // this is a generic array

    public OrderedArray(Class<T>dataType, int size) {
        // Class<T>dataType this is given to ignore classcastexception error.
        //
        this.size = size;  // size sets the size
        this.numOfItems = 0; // items is 0 cause int array starts at 0 index
        this.m_array =  (T[]) java.lang.reflect.Array.newInstance(dataType, size); // this gives
    }

    public boolean AddItemsInOrder(T item){
        if(numOfItems >size) return false;
        if(LinearSearch(item)==-1){ // if its negative -1 means no item is there.
            m_array[numOfItems] = item; // in the begining numOfitems will be 0 cause item start at 0 index.
            numOfItems++; // goes up;
            return true;
        }
       return false;
    }

    public String PrintItems(){
        StringBuilder output = new StringBuilder("Here Are the items on the array" + "\n");
        for (int i = 0; i < numOfItems; i++) {
            /*
             use numofitems is better cause it will loop through the added object not null object.
             so lets say 3 items like 1 2 and 3 has been added only 1,2 and 3 will be printed.
             even though size is 5 only 3 items has been added so it will be printed.
            */
            output.append(m_array[i]).append("\n");
        }
        return output.toString();
    }

    public int LinearSearch(T Item){
        for (int i = 0; i < numOfItems; i++) {
            if(m_array[i].equals(Item)) return i;
            /*
            simple linear search it goes through items and finds whether or not match is found.
             */
        }
        return -1;
    }
public boolean RemoveItem(T item){
var indexOfItem = LinearSearch(item);
 if(indexOfItem==-1)return false;
 else {
     for (int i = indexOfItem; i < numOfItems -1 ; i++) {
         /*
          i < numOfItems -1 reminder this has to be numoftiems-1;
           cause what if the final number has to be deleted like
           m_array[i] = m_array[i+1];
           --> lets say array has 5 times with [1,2,3,4,5]
             -->    m_array[i] --> is at index 4
                    i < numOfItems -1 --> i<4 4<4 which means both are equal so no point in doing this exercise m_array[i] = m_array[i+1];

                    --> if numofItems-1 was not included 4<5 --> m_array[4] = m_array[4+1]  will be done so it will cause index out of range
          */
         m_array[i] = m_array[i+1];
     }
     numOfItems--; // num of items will go down. when it gets out of the loop;
     return true;
 }

}
public boolean RemoveByIndex(int index){
    if(index>(numOfItems -1)) return false; // this is a safe counter cause this way out of bounds expection will not occour.
    for (int i = index; i < numOfItems -1 ; i++) {
        // refer to note on remove by item.
        m_array[i] = m_array[i+1];
    }
    numOfItems--;
    return true;
}
public int BinarySearchAscending(T ValueTofind){
        var left = 0; // left is starting point of the array always starts from 0
        var right = numOfItems -1; // this is done cause array count starts at 0 thus even array has 10 items last items will be 9
        while (left<=right){

            var mid = (left+right)/2;
            // mid is the get by adding (left+right)/2 it will always ben an integer cause index do not start from 0.5
            if(ValueTofind.equals(m_array[mid])) return mid;
            // this will break the loop if the item is in the midpoint
            if(ValueTofind.compareTo(m_array[mid])>0) left = mid+1;
            // lets say if value>mid means no point staying at the left side
            else right=mid-1; // if  value<0  means right gets moved


            /*
            ***** ValueTofind is 4 *****
            lets say array exists with the following item
            [1,2,3,4,5]
            first iteration on the loop here are the values
            left = 0 -->m_array[0]  value 1
            right = 5-1 -->4 m_array[4] value 5
            midpoint = 2 m_array[2] value 3

            * the following result will happend in here.
            * (ValueTofind.compareTo(m_array[mid])>0) left = mid+1; --> qualifies here
            * 4>3 so left will be changed now
            * left will be added to 1 so left= mid+1 --> left = 2+1 --> 3;

            * so current value for the loop is the following
            --> left = 3 right =4 --> mid (3+4)/2 -->3 is the mid
            *  -->  if(ValueTofind.equals(m_array[mid])) return mid;
            *         (3).equals(3) thus loop stops


             */
        }

        return -1;
}

public  int BinarySearchDecending(T ValueToFind){
        var left =0;
        var right = numOfItems-1;
        while (left<=right){
            var mid = (left+right)/2;
            if(ValueToFind.equals(m_array[mid])) return mid;
            if(ValueToFind.compareTo(m_array[mid])>0) right = mid-1;
            /*
            array = [5,4,3,2,1] in here array is in decending order.
            going to look for 5 in here mid point
            5> 3 array is sorted in this way [5,4,3,2,1]
            no point of moving left cause array location on highest point which means right will be shifted
            right will be moved left side so right will be mid-1

             */
            else left = mid+1;
            /*
              /*
            array = [5,4,3,2,1] in here array is in decending order.
            going to look for 1 in here mid point
            1< 3 array is sorted in this way [5,4,3,2,1]
            left will be moved mid+1 cause lowest value located on left side
           right side will not be changed.
             */



        }
        return -1;

}

}

