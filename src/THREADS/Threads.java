package THREADS;

public class Threads {

    public static void main(String[] args) {
        // this creates thread object from the class that we named threads Example
        Thread threadOne = new Thread(new ThreadsExample("One"));
        Thread threadTwo = new Thread(new ThreadsExample("Two"));
        Thread threadThree = new Thread(new ThreadsExample("Three"));
        Thread threadFour = new Thread(new ThreadsExample("Four"));

        // we need to start them
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
    }





}
