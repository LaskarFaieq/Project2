package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add("jhon");
        queue.add("doe");

        System.out.println(queue.poll());


    }
}
