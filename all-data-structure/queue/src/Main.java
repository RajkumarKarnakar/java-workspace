import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("person1");
        queue.offer("person2");
        queue.offer("person3");
        queue.offer("person4");
        queue.offer("person5");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

        Queue<String> priorityQueue = new PriorityQueue<>();
        /*priorityQueue.offer("person raj");
        priorityQueue.offer("person laxmi");
        priorityQueue.offer("person pro");
        priorityQueue.offer("person raj");
        priorityQueue.offer("person laxmi");*/
        priorityQueue.offer("100");
        priorityQueue.offer("50");
        priorityQueue.offer("200");
        priorityQueue.offer("10");
        System.out.println(priorityQueue);
        priorityQueue.poll();
        System.out.println(priorityQueue);
    }
}