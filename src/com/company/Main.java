package com.company;

import ArrayClass.MyArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        var test = new MyArray<String>(10);
        System.out.println(test.getIndex(0));
        test.Push("hello");
        test.Push("hi");

        var intTest = new MyArray<Integer>(10);
        intTest.Push(10);
        intTest.Push(20);
        intTest.Push(30);
        intTest.Push(40);
        intTest.ShiftItems(1);
        intTest.printItems();


    }
}
