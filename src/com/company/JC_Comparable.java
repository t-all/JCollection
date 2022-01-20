package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JC_Comparable {

    public void comparablePrint() {
        List<People> peopleList = new ArrayList<>();
        Set<People> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        System.out.println(peopleList);
        System.out.println(peopleSet);

    }

    private static void addElements(Collection collection) {
        collection.add(new People(3, "Bob"));
        collection.add(new People(1, "Bil"));
        collection.add(new People(2, "Mike"));
        collection.add(new People(4, "Jimmy"));
    }
}

class People implements Comparable<People>{
    private int id;
    private String name;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        if (id != people.id) return false;
        return name != null ? name.equals(people.name) : people.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(People o) {
       if(this.id > o.getId()) {
           return 1;
       } else if(this.id < o.getId()) {
           return -1;
       } else {
           return 0;
       }
    }
}