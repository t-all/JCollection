package com.company;

import java.util.ArrayList;
import java.util.List;

public class JC_ArrayList {

    public void arrayListPrint() {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
