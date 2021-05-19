package SearchSort;

public class BasicArray {
    private int[] arrayData;
    private int numOfItems; // will keep how many items on the array
    private int size; // this wll limiot the array sizes.

    public BasicArray(int size) {
        this.size = size;
        this.numOfItems = 0; // will start at 0
       arrayData  = new int[size];// this will limit number of items;
    }

    public boolean AddItem(int item){
      if(numOfItems>size) return false; // this means maxitems hasbeen reached and no data can not be added.
      arrayData[numOfItems] = item; // add arrayData index to number of items here
      numOfItems++; // numberoftiems goes up cause data has been added
      return true; // return True.

    }

    public void printItems(){
        System.out.println("Items in the array");
        for (int i = 0; i <numOfItems ; i++) {
            // note here numofitems has been used here to get the size of the items.
            System.out.println(arrayData[i]);
        }
        System.out.println("");
    }

    public int BinarySearchAscendingOrder(int valueToFind){
        var left = 0; // starting point
        var right = numOfItems-1; // high is in the
        var mid = 0; // will be 0 in the begining
        while(left<=right){
            // if let is less than right keep going on with the loop
            mid =  (left+right)/2; // mid is the value between 2 values
            if (arrayData[mid]==valueToFind) return mid; // this returns the mid.
            else if(valueToFind<arrayData[mid]) left = mid+1; // this add plus one to right moving right
            else right = mid - 1;
        }
        return -1;
    }



}
