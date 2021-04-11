package BASICS;


import java.util.Iterator;
import java.util.PriorityQueue;

//A PriorityQueue is used when the objects are supposed to be
// processed based on the priority. It is known that a Queue
// follows the First-In-First-Out algorithm,
// but sometimes the elements of the queue are needed to be
// processed according to the priority, that’s when
// the PriorityQueue comes into play. The PriorityQueue
// is based on the priority heap. The elements of the priority
// queue are ordered according to the natural ordering, or
// by a Comparator provided at
// queue construction time, depending on which constructor is used.
// The class implements Serializable, Iterable<E>, Collection<E>, Queue<E> interfaces.
public class PriorityQ {

    public static void main(String[] args) {
        PriorityQueue <String> priorityQ = new PriorityQueue<>();
        // we populate Q with offer() method and everything we pass
        // in it's gonna be first priority
        priorityQ.offer("First");
        priorityQ.offer("Second");
        priorityQ.offer("Third");
        System.out.println(priorityQ);
        System.out.println("------------");

        //peek() looking for elements with highest priority
        System.out.println(priorityQ.peek());
        // remove element based on highest priority
        System.out.println("------------");
        priorityQ.poll();
        System.out.println(priorityQ);


        // iterating the elements - again with iterator

        Iterator iterator = priorityQ.iterator();

        while (iterator.hasNext()){
            System.out.println("iterating " + iterator.next() + " ");
        }


    }






}
