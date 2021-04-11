package BASICS;
import java.util.*;

// Collection is array of objects
public class Collections {
    public static void main(String[] args) {
        ArrayList <String> array1 = new ArrayList <String> (Arrays.asList("eggs", "lasers", "hats", "pie"));
        List<String> list = new ArrayList<String>();
        // add array item to list
        for (String x: array1) {
            list.add(x);
        }
        //System.out.println(list);
        ArrayList <String> array2 = new ArrayList <String> (Arrays.asList("lasers", "hats", "bacon", "pigs", "money"));
        Iterator<String> iterator = array2.iterator();
        editLists(array1, array2);
        //System.out.println(array1);
    }

    public static void editLists(Collection <String> list1, Collection <String> list2) {
        Iterator<String> iterator = list2.iterator();
        while (iterator.hasNext()) {
            //if (list2.contains(iterator.next()))
               // iterator.remove();
            System.out.println(iterator.next());
        }
    }

}
