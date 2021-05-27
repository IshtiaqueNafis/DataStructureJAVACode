package ArrayGeneric;

public class UnOrderedArray {
    private int maxSize;
    private int numOfItems;
    private int[] m_array;

    public UnOrderedArray(int maxSize) {
        this.maxSize = maxSize;
        this.numOfItems = 0;
        this.m_array = new  int[maxSize];

    }

   public boolean AddLast(int item){
        if(numOfItems>maxSize) return false;

        if(numOfItems==0){
            m_array[numOfItems] = item;
        }else {
            for (int i = numOfItems-1; i >=0 ; i--) {
               m_array[i+1] = m_array[i];

            }
            m_array[0] = item;
        }
       numOfItems++;


       return true;


   }

   public boolean RemoveLast(){
        if (numOfItems==0) return false;
        else {
            m_array[numOfItems-1] = 0;
            numOfItems--;
        }
        return true;
   }


    public void RemoveByIndex(int index){

        for (int i = index; i <this.numOfItems-1 ; i++) {

            this.m_array[i+1] = this.m_array[i]; // shift it
        }

        this.numOfItems--;
    }


    public String PrintItems(){
        StringBuilder output = new StringBuilder();
        output.append("here are the list:"+"\n");
        for (int i = 0; i <numOfItems ; i++) {
            output.append(m_array[i]).append("\n");

        }
        return output.toString();
    }

public void EfficientRemove(int index){
    m_array[index] = m_array[numOfItems-1];
    numOfItems--;
}

public int linearSearch(int item){
    for (int i = 0; i <numOfItems ; i++) {
        if(item==m_array[i]) return i;
    }
    return -1;
}

public void InsertionSortASC(){
    for (int i = 1; i <numOfItems ; i++) {
        var value = m_array[i];
        var hole = i;
        while (hole>0 && m_array[hole-1]>value){
            m_array[hole] = m_array[hole-1];
            hole--;
        }
        m_array[hole] = value;
    }
}

public void InsertionSortDSC(){
    for (int i = 1; i <numOfItems ; i++) {
        var value = m_array[i];
        var hole = i;
        while (hole>0 && m_array[hole-1]<value){
            m_array[hole] = m_array[hole-1];
            hole--;
        }
        m_array[hole] = value;
    }

}

public void SelectionSortASC(){
    for (int startIndex = 0; startIndex <numOfItems-1 ; startIndex++) {
        var minArrayIndex = startIndex; // this assumed the first array is the
        for (int compareStartIndex = startIndex+1; compareStartIndex <numOfItems ; compareStartIndex++) {
            if(m_array[minArrayIndex]>m_array[compareStartIndex])
                minArrayIndex = compareStartIndex;
        }
        var temp = m_array[startIndex];
        m_array[startIndex] = m_array[minArrayIndex];
        m_array[minArrayIndex] = temp;
    }
}

    public void SelectionSortDesc(){
        for (int startIndex = 0; startIndex <numOfItems-1 ; startIndex++) {
            var minArrayIndex = startIndex; // this assumed the first array is the
            for (int compareStartIndex = startIndex+1; compareStartIndex <numOfItems ; compareStartIndex++) {
                if(m_array[minArrayIndex]<m_array[compareStartIndex])
                    minArrayIndex = compareStartIndex;
            }
            var temp = m_array[startIndex];
            m_array[startIndex] = m_array[minArrayIndex];
            m_array[minArrayIndex] = temp;
        }
    }

    public int BinarySearchAscendingSearch(int valueToFind){
        var leftPoint = 0;  // starting point
        var rightPoint = numOfItems-1; // high is in the

        while(leftPoint<=rightPoint){
            // if let is less than rightPoint keep going on with the loop
            var midPoint =  (leftPoint+rightPoint)/2; // midPoint is the value between 2 values
            if (valueToFind==m_array[midPoint]) return midPoint; // this returns the midPoint.
                // this add plus one to rightPoint moving rightPoint
            else if(valueToFind>m_array[midPoint]) leftPoint = midPoint+1;
            else rightPoint = midPoint-1;
        }
        return -1;
    }

    public int BinarySearchDescendingSearch(int valueToFind){
        var leftPoint = 0;  // starting point
        var rightPoint = numOfItems-1; // high is in the

        while(leftPoint<=rightPoint){
            // if let is less than rightPoint keep going on with the loop
            var midPoint =  (leftPoint+rightPoint)/2; // midPoint is the value between 2 values
            if (valueToFind==m_array[midPoint]) return midPoint; // this returns the midPoint.
                // this add plus one to rightPoint moving rightPoint
            else if(valueToFind>m_array[midPoint]) rightPoint = midPoint-1;
            else leftPoint = midPoint+1;
        }
        return -1;
    }

    public void RemoveItem(int item){
        var index = linearSearch(item);
        if(index==-1) System.out.println("no match found removing will not be done");
        else {
            for (int i = index;i<numOfItems;i++ ){
                m_array[i] = m_array[i+1];
            }
            numOfItems--;
        }

    }

}
