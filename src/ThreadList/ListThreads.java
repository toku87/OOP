package ThreadList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by RENT on 2017-09-04.
 */
public class ListThreads implements Runnable{

    private ArrayList<Integer>_listOne = new ArrayList<>();
    private ArrayList<Integer>_listTwo = new ArrayList<>();

    private Object stageOneLocker = new Object();
    private Object stageTwoLocker = new Object();

    private Random rand = new Random();

    private int counter;

    public void stageOne() throws InterruptedException {
        synchronized (stageOneLocker) {
            _listOne.add(rand.nextInt());
            Thread.sleep(1);
        }
    }
    public void stageTwo() throws InterruptedException {
        synchronized (stageTwoLocker) {
            _listTwo.add(rand.nextInt());
            Thread.sleep(1);
        }
    }

    public void process() throws InterruptedException {
       while (counter < 1000){
            stageOne();
            stageTwo();
           counter++;
        }
    }

    @Override
    public void run() {
        try {
            process();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
