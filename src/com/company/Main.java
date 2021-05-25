package com.company;

import ArrayGeneric.UnOrderedArray;

public class Main {

    public static void main(String[] args) {

var a = new UnOrderedArray(5);
a.AddLast(1);
a.AddLast(2);
a.AddLast(3);
a.AddLast(4);
a.AddLast(5);

System.out.println(a.PrintItems());
a.InsertionSortASC();
a.RemoveItem(1);
System.out.println(a.PrintItems());





















    }
}
