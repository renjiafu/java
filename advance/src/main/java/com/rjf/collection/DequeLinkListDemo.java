package com.rjf.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeLinkListDemo {

    public static void main(String[] args){

        Deque<String> deque=new LinkedList<>();
        deque.offerLast("A");
        deque.offerLast("B");
        deque.offerLast("C");
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());


        /*

            队列Queue实现了一个先进先出（FIFO）的数据结构：

            通过add()/offer()方法将元素添加到队尾；
            通过remove()/poll()从队首获取元素并删除；
            通过element()/peek()从队首获取元素但不删除。

                                     Queue	                Deque
            添加元素到队尾	        add(E e) / offer(E e)	addLast(E e) / offerLast(E e)
            取队首元素并删除	        E remove() / E poll()	E removeFirst() / E pollFirst()
            取队首元素但不删除	    E element() / E peek()	E getFirst() / E peekFirst()
            添加元素到队首	        无	                    addFirst(E e) / offerFirst(E e)
            取队尾元素并删除	        无	                    E removeLast() / E pollLast()
            取队尾元素但不删除	    无	                    E getLast() / E peekLast()

       */

    }
}
