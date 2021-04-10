package UNIT1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
        String[] array = {"books", "computers", "kindle", "candles"};
        //convert it to a list
        List<String> list = Arrays.asList(array);

        // methods from the Collection class can be applied to the list
        // we can't do this to an array, just to the list

        //sorts list in alphabetical order
        Collections.sort(list);
        //System.out.printf( "%s\n", list);
        // reverse it
        Collections.sort(list, Collections.reverseOrder());
        //System.out.printf( "%s\n", list);


        //some more collections methods. We can apply them to the lists
        //because lists inherits from the Collections

        Character[] arrayOfChars= {'a', 'b', 'c', 'q', 'g'};
        List<Character> listOfChars = Arrays.asList(arrayOfChars);
        // System.out.println("List is: " + listOfChars);
        output(listOfChars);

        // reverse and print our the list
        Collections.reverse(listOfChars);
        // System.out.println("Reversed: " + listOfChars);

        //copy the list to another list
        Character[] newArrayOfChars= new Character[listOfChars.size()];
        List<Character> copyOfTheListOfChars = Arrays.asList(newArrayOfChars);
        Collections.copy(copyOfTheListOfChars, listOfChars);
        // System.out.println("Copy of the list: " + copyOfTheListOfChars);

        // fill up the list/ collection
        // we replaced it with the second parameter that we passed
        Collections.fill(list, "x");
        // System.out.println("filled list " + list);

        // add all - take elements from one collection and add to another collection
        String[] array2 = {"books", "computers", "kindle", "candles"};
        String[] array3 = {"Ana", "Max", "Elrond", "Frodo"};
        List<String> list2 = Arrays.asList(array2);
        ArrayList<String> list3 = new ArrayList<String>(Arrays.asList(array3));

        System.out.println("List3 " + list3);

        //add elements from array2 to array3 / using lists

        Collections.addAll(list3, array2);
        System.out.println("List 3 after adding from array2 " + list3);
        // frequency - checks how many time element is in the array
        System.out.println(Collections.frequency(list3, "kindle")); // output 1

    }

    private static void output(List<Character> listOfChars) {
    }
}













