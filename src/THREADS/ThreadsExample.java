package THREADS;


import java.util.Random;

// thread allows us to do multiple things at once, to run multiple
// programs at once
// to use / do it we need to implement the interface Runnable
public class ThreadsExample  implements Runnable{
    public static void main(String[] args) {

    }
    // runnable implements the run method that we need to @Override
    // whatever we put in this method will start  when we start our thread

    String name;
    int time;
    Random random = new Random();

    public ThreadsExample(String name) {
        this.name=name;
        time = random.nextInt(999);
    }

    @Override
    public void run() {
        try {
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
