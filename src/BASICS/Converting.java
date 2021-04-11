package BASICS;
// converting list to array and vice versa
import java.util.Arrays;
import java.util.LinkedList;

public class Converting {
    public static void main(String[] args) {
        String[] array = {"books", "computers", "kindle", "candles"};
        LinkedList<String> theList = new LinkedList<String>(Arrays.asList(array));

        theList.add("something");
        theList.addFirst("somethingElse");
        theList.addLast("add last");
        theList.addAll(Arrays.asList(array));
        // System.out.println(theList);

        // once we are done treating  it like list we can just convert it back
        // to have be able to use our usual array methods on it like fori for bla bla
        //convert back to an array

        array = theList.toArray(new String[theList.size()]);
        System.out.println(Arrays.toString(array));
    }
}
