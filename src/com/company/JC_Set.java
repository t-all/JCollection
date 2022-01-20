package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class JC_Set {
    public Set<String> setPrint() {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Tom");
        hashSet.add("Bob");
        hashSet.add("Tim");
        hashSet.add("Sam");
        hashSet.add("Bil");
        hashSet.add("Bil");
        hashSet.add("Bil");

//        for(String name : hashSet) {
//            System.out.println(name);
//        }

//        //contains проверяет существует ли указанное значение в множестве Set
//        System.out.println(hashSet.contains("Tom"));
//        System.out.println(hashSet.contains("Zak"));
//
//        //проверяем пустое множество или нет
//        System.out.println(hashSet.isEmpty());
//
//        //получаем кол-во записей в Set
//        System.out.println(hashSet.size());
//
//        System.out.println(hashSet);


        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        // union - объединение множеств
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(union);

        // intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);

        return null;
    }
}
