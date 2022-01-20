package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class JC_Queue {
    public Object queuePrint() {
        Chelovek chelovek1 = new Chelovek(1);
        Chelovek chelovek2 = new Chelovek(2);
        Chelovek chelovek3 = new Chelovek(3);
        Chelovek chelovek4 = new Chelovek(4);
        Chelovek chelovek5 = new Chelovek(5);

        Queue<Chelovek> people = new ArrayBlockingQueue<Chelovek>(4);
        people.add(chelovek3);
        people.add(chelovek2);
        people.add(chelovek4);

        System.out.println(people.offer(chelovek5));
        System.out.println(people.offer(chelovek1));

        System.out.println(people.remove());
        System.out.println(people.peek());
        System.out.println(people);

        return null;
    }
}
class Chelovek {
    private int id;

    public Chelovek(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Chelovek{" +
                "id=" + id +
                '}';
    }
}
