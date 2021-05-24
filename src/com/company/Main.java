package com.company;

import InsertionSort.InSertionSortArray;
import SelectionSort.ArrayCrud;

public class Main {

    public static void main(String[] args) {

  var a = new InSertionSortArray(6);
  a.addItem(5);
  a.addItem(4);
  a.addItem(10);
  a.addItem(1);
  a.addItem(6);
  a.addItem(2);
        System.out.println(  a.PrintItems());
   a.InsertionSortDecending();
        System.out.println(  a.PrintItems());
   System.out.println(a.toString());





    }
}
