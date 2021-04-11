package BASICS;

import java.util.Arrays;
import java.util.Collections;

import static java.lang.Integer.parseInt;

public class Basics1 {
    public static void main(String[] args) {
        //swap(2,3);
        //averageOfThree(5,5,5);
        // calculateForRectangle(5.6F, 8.5F);
        // homeland();
        //binaryToDecimal(100);
    }
//Write a Java program to swap two variables.
    public static void swap( int v1, int v2) {
        int temp = v1;
        v1 = v2;
        v2 = temp;
        System.out.println(v1+" "+v2);

    }

    //Write a Java program that takes three
    // numbers as input to calculate and print the average of the numbers.
    public static void averageOfThree(int a, int b, int c){
        System.out.println( (a+b+c) / 3);
    }

    //Write a Java program to print the area and perimeter of a rectangle.
    public static void calculateForRectangle(float width, float height) {
        System.out.println("Area of rectangle:" + width * height);
        System.out.println("Parameter of rectangle " + 2 * (width + height));

    }

    // Write a Java program to print an American flag on the screen.
    public static void homeland() {
        for(int i = 0; i < 3; i++){
            System.out.println( "* * * * * * ================");
            System.out.println( " * * * * *  ================");
        }
        for (int i = 0; i < 6; i++) {
            System.out.println( "============================");
        }
    }


    // write program that turns binary to decimal

    static void reverseString(String myArray[])
    {
        Collections.reverse(Arrays.asList(myArray));

    }

    public static void binaryToDecimal(int binary) {
        //split number to array of chars
        String[] splitBinary = Integer.toString(binary).split("");
        //declare outside variable to compute the result
        double output = 0;

        for (int i = 0; i < splitBinary.length; i++) {
            //loop trough array and for every 1 in array math.pow 2 with i on that char
            if (splitBinary[i].equals("1"))
                output += Math.pow(2, splitBinary.length - 1 - i);
        }
        System.out.println(output);
    }

    public static void addTwoBinary(int binary1, int binary2) {

    }

}
















