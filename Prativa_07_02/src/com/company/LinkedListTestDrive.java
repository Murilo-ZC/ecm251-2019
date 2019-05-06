package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        List<Item> lista = new LinkedList<Item>();
        lista.add(new Item(1, "XBOX ONE"));
        lista.add(0, new Item(2, "Switch"));
        lista.add(new Item(3, "PS4"));

        System.out.println("Tamanho:" + lista.size());
//        for (Item i: lista) {
//            System.out.println("Item - " + i);
//        }
        Iterator<Item> itemIterator = lista.iterator();
        while(itemIterator.hasNext()){
            System.out.println(itemIterator.next());
        }
    }
}
