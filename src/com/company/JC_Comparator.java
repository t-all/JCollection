package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JC_Comparator {
    public Object comparatorPrint() {
        List<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add("qw");
        animals.add("birdd");

        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(345);
        numbers.add(109);
        numbers.add(56);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(numbers);

        List<Persons> persons = new ArrayList<>();
        persons.add(new Persons(3, "Bob"));
        persons.add(new Persons(1, "Bil"));
        persons.add(new Persons(2, "Mike"));

        Collections.sort(persons, new Comparator<Persons>() {
            @Override
            public int compare(Persons o1, Persons o2) {
                if(o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return  -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(persons);
        
        return null;
    }
}

class Persons {
    private int id;
    private String name;

    public Persons(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
