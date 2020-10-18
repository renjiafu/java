package com.rjf.collection;

/*
 *
 *   Rene
 *   2020/5/24 21:34
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class StackDemo {

    public static void main(String[] args) {

        Deque<Integer> deque1 = new LinkedList<>();

        deque1.push(1);
        deque1.push(2);
        deque1.push(3);
        while(deque1.peek()!=null){
            System.out.println(deque1.pop());
        }

        Deque<Integer> deque2 = new ArrayDeque<>();
        deque2.push(1);
        deque2.push(2);
        deque2.push(3);
        while (deque2.peek()!=null){
            System.out.println(deque2.pop());
        }

    }
}
