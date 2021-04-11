package GENERIC_CLASSES_AND_METHODS;

// it is a way to eliminate overloaded methods
// The idea is to allow type (Integer, String, … etc,
// and user-defined types) to be a parameter to methods,
// classes, and interfaces. Using Generics, it is
// possible to create classes that work with different data types.
// Object is the superclass of all other classes and Object reference
// can refer to any type object.
// These features lack type safety. Generics adds that type safety feature
// the wat to build generic method that can take any time of data
public class GenericExample {

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4};
        Character[] charArray = {'a', 'b', 'c', 'd'};

        // we can create a methods that take different data but
        //it is repetition of the code
        printMe(integerArray);
        System.out.println();
        printMe(charArray);
    }

    // methods that take different type of data
       // public static void printMe(Integer[] integerArr) {
         //   for (Integer integer : integerArr) {
          //      System.out.printf("%s ", integer);
           // }
        //}

        //public static void printMe(Character[] charArr) {
          //  for (Character ch : charArr){
            //    System.out.printf("%s ", ch);
            //}
        //}


    //instead those two methods up there we can just have one that takes,
    // in the parameter of the data type (String, integer blablabla)

    // here is generic method
    public static <T> void printMe(T[] data ) {
        for(T element : data) {
            System.out.printf("%s ", element);
        }
    }
}
