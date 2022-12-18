package Supermarket;


import java.util.ArrayDeque;
import java.util.Queue;

public class Supermarket {
    Queue<String> queueOne = new ArrayDeque<>(5);
    Queue<String> queueTwo = new ArrayDeque<>(5);
    Queue<String> queueThree = new ArrayDeque<>(5);

    public void add (String s){
        if (queueOne.size() < 5) {
            queueOne.add(s);
            System.out.println("Добавлено в первую очередь " + s);
        } else {
            if (queueTwo.size() < 5) {
                queueTwo.add(s);
                System.out.println("Добавлено во вторую очередь " + s);
            } else {
                queueThree.add(s);
                System.out.println("Добавлено в третью очередь " + s);
            }
        }
    }

}