package com.company;

import com.company.ArrayCRUD.OrderedArray;

public class Main {

    public static void main(String[] args) {
       var a = new OrderedArray<>(Integer.class,5);
       a.AddItemsInOrder(5);
       a.AddItemsInOrder(4);
       a.AddItemsInOrder(3);
       a.AddItemsInOrder(2);
       a.AddItemsInOrder(1);

        System.out.println(a.PrintItems());
        System.out.println(a.BinarySearchDecending(77));
























    }
}
