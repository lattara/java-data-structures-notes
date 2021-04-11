package BASICS;

// it is a collection that can't hold any duplicates
// it extends the collection interface and it's unordered collection of objects.
// it contains methods inherited from the collection interface +
// the feature that restricts the insertion of the duplicate elements.
// we have 2 elements:
//SortedSet and NavigableSet

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetsExample {

    public static void main(String[] args) {
        String[] array = {"sun", "clouds", "banana", "clouds"};
        List<String> list = Arrays.asList(array);
        System.out.printf("%s ", list);

        // hash set to remove duplicates
        Set<String> setOfList = new HashSet<String>(list);
        System.out.println(setOfList); // will remove duplicates (an sort it) ??

    }



}
