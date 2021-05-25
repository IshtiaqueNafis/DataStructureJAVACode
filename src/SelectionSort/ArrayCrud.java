package SelectionSort;

public class ArrayCrud {
    private int[] arrayData;
    private int numOfItems; // will keep how many items on the array
    private int size; // this wll limiot the array sizes

    public ArrayCrud(int size) {
        this.size = size;
        this.numOfItems = 0;
        arrayData = new int[size];
    }

    public String PrintItems(){
        StringBuilder output = new StringBuilder();
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

    public void SortSectionDecendingOrder(){
        for (int startIndex = 0; startIndex <numOfItems-1 ; startIndex++) {
            var minArrayIndex = startIndex; // this assumed the first array is the
            for (int compareStartIndex = startIndex+1; compareStartIndex <numOfItems ; compareStartIndex++) {
                if(arrayData[minArrayIndex]<arrayData[compareStartIndex])
                    minArrayIndex = compareStartIndex;
            }
            var temp = arrayData[startIndex];
            arrayData[startIndex] = arrayData[minArrayIndex];
            arrayData[minArrayIndex] = temp;
        }
    }

    public void SortSectionAscendingOrder(){
        for (int startIndex = 0; startIndex <numOfItems-1 ; startIndex++) {
            var minArrayIndex = startIndex; // this assumed the first array is the
            for (int compareStartIndex = startIndex+1; compareStartIndex <numOfItems ; compareStartIndex++) {
                if(arrayData[minArrayIndex]>arrayData[compareStartIndex])
                    minArrayIndex = compareStartIndex;
            }
            var temp = arrayData[startIndex];
            arrayData[startIndex] = arrayData[minArrayIndex];
                                                                                                                                      arrayData[minArrayIndex] = temp;
        }
    }



    public int BinarySearchAscendingSearch(int valueToFind){
        var leftPoint = 0;  // starting point
        var rightPoint = numOfItems-1; // high is in the

        while(leftPoint<=rightPoint){
            // if let is less than rightPoint keep going on with the loop
           var midPoint =  (leftPoint+rightPoint)/2; // midPoint is the value between 2 values
            if (valueToFind==arrayData[midPoint]) return midPoint; // this returns the midPoint.
            // this add plus one to rightPoint moving rightPoint
            else if(valueToFind>arrayData[midPoint]) leftPoint = midPoint+1;
            else rightPoint = midPoint-1;
        }
        return -1;
    }
    public int BinarySearchDecendingSearch(int valuetoFind){
        var leftPoint = 0;
        var rightPoint = numOfItems-1;
  while (leftPoint<=rightPoint){
      var midPoint = (leftPoint+rightPoint)/2;
      if(valuetoFind==arrayData[midPoint]) return midPoint;
      else if(valuetoFind>arrayData[midPoint]) rightPoint = midPoint-1;
      else leftPoint = midPoint+1;
  }
return -1;
    }



}
