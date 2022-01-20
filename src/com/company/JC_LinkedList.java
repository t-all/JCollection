package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JC_LinkedList {

    public List<Integer> linkedListPrint() {

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);

        return Collections.singletonList(1);
    }

    public void measureTime(List<Integer> list) {

        long start = System.currentTimeMillis();

//        //получение элементов linkedList - 3361 ms / arrayList - 7 ms
//        for (int i = 0; i < 100000; i++) {
//            list.get(i);
//        }

//        //добавление элементов linkedList - 8 ms / arrayList - 4 ms
//        for(int i = 0; i < 100000; i++) {
//            list.add(i);
//        }

        //добавление элементов в начало листа linkedList - 8 ms / arrayList - 802 ms
        for(int i = 0; i < 100000; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
