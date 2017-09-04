package SimpleThread;


public class MyRun2 implements Runnable {

    private String _name;

    public MyRun2 (String name){
        _name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.printf("%s Hello",_name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("GOODBYE");

    }
}
