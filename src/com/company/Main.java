package com.company;

import SelectionSort.ArrayCrud;

public class Main {

    public static void main(String[] args) {

  var arrayOperation = new ArrayCrud(10);

   arrayOperation.addItem(32);
   arrayOperation.addItem(8);
   arrayOperation.addItem(29);
   arrayOperation.addItem(-6);
   arrayOperation.addItem(17);
   arrayOperation.addItem(32);
   arrayOperation.addItem(3);
   arrayOperation.addItem(8);
   arrayOperation.addItem(5);
   arrayOperation.addItem(23);
 arrayOperation.SortSectionDecendingOrder();
 System.out.println( arrayOperation.PrintItems());
 System.out.println("\n");
     System.out.println(arrayOperation.BinarySearchDecendingSearch(99));



    }
}
