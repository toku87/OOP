package ThreadList;

/**
 * Created by RENT on 2017-09-04.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ListThreads lt = new ListThreads();

        Thread t1 = new Thread(lt);
        Thread t2 = new Thread(lt);

        long currentTime = System.currentTimeMillis();
        t1.run();
        t2.run();
        t1.join();
        t1.join();
        System.out.println(System.currentTimeMillis() - currentTime);
    }
}
