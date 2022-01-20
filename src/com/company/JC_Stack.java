package com.company;

import java.util.Stack;

public class JC_Stack {
    public Object stackPrint() {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(3);
        stack.push(1);

//        //.peek смотрим элемент
//        System.out.println(stack.peek());
//        //.pop достает последний элемент
//        System.out.println(stack.pop());

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        return null;
    }
}
