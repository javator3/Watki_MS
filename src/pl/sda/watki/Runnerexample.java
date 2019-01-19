package pl.sda.watki;

public class Runnerexample extends Thread{

    @Override
    public void run() {
        for (int i=0; i<50; i++){
            System.out.println("Hello: " + i + " Thread: " +
                    Thread.currentThread().getName());
            //silnia(i)
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
