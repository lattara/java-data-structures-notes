package BASICS;

/*
        ArrayList vs. LinkedList
        The LinkedList class is a collection which can contain many objects of the same type,
        just like the ArrayList.The LinkedList class has all of the same methods as the ArrayList class
        because they both implement the List interface.
        This means that you can add items, change items, remove items and clear the list in the same way.
        However, while the ArrayList class and the LinkedList class can be used in the same way,
        they are built very differently.
        ***How the ArrayList works***
        The ArrayList class has a regular array inside it.
        When an element is added, it is placed into the array.
        If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.
        ***How the LinkedList works***
        The LinkedList stores its items in "containers."
        The list has a link to the first container and each container has a link to the next container
        in the list.
        To add an element to the list, the element is placed into a new container
        and that container is linked to one of the other containers in the list.
        ***When To Use***
        It is best to use an ArrayList when:
        You want to access random items frequently
        You only need to add or remove elements at the end of the list
        It is best to use a LinkedList when:
        You only use the list by looping through it instead of accessing random items
        You frequently need to add and remove items from the beginning, middle or end of the
        list
*/

import java.util.*;

public class LikedList {

    public static void main(String[] args) {
        // create array of strings
        String [] array1 = {"dogs", "cats", "horses", "people", "birds" };
        String [] array2 = {"people", "dogs", "kangaroos", "hamsters", "dogs" };
        // convert the array of strings into an List // interface list remember
        List<String> list1 = new LinkedList<String>(Arrays.asList(array1));
        List<String> list2 = new LinkedList<String>(Arrays.asList(array2));
        //some build in methods
        // adds all the items from list 2 to list 1
        list1.addAll(list2);
        list2 = null; // good practice to remove some of the memory we are not using anymore
        //System.out.println(list1); // output [Item1, Item2, Item3, Item4, Item5, Item11, Item2, Item33, Item44, Item5]
        
        //printMe(list1);
        //System.out.println();
        //removeStuff(list1, 2,5);
        //printMe(list1);
        reverseMe(list1);
    }

    private static void reverseMe(List<String> list1) {
        ListIterator<String> listIterator = list1.listIterator(list1.size());
        List<String> reversedList = new LinkedList<String>();
        while (listIterator.hasPrevious())
            reversedList.add(listIterator.previous());
        System.out.println(reversedList);
    }

    private static void removeStuff(List<String> list1, int from, int to) {
        // create sublist that is built in method from java
        // returns part of the list from index1 to index2 takes in list, index1m index2
        list1.subList(from, to).clear();
    }

    private static void printMe(List<String> list1) {
        for(String elementInTheList : list1 ) {
            System.out.printf("%s ", elementInTheList);
        }
    }


}
