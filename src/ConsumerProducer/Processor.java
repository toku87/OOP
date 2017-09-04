package ConsumerProducer;


import java.util.Scanner;

public class Processor {

    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Cook is cooking a meal");
            wait();
            System.out.println("Cooking Resumed");
        }

    }
    public void consume() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this){
            System.out.println("When meal is done, press ENTER");
            sc.nextLine();
            System.out.println("ENTER pressed");
            notify();
        }

    }
}
