package GENERIC_CLASSES_AND_METHODS;

// how to return generic data

public class ReturnGenericData {
    public static void main(String[] args) {
        System.out.println(maximum("ana","42", "ska"));
    }

    // compareTo() is a method that takes int and string
    // so we are leveraging it here for create our method
    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T maximum = a;
        if(b.compareTo(maximum) > 0)
            maximum = b;
        if (c.compareTo(maximum) >0)
            maximum = c;
        return maximum;
    }


}


