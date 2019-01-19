package pl.sda.watki;

import java.util.Scanner;

class Runner implements Runnable{
//alt + Enter - podpowiedzi

    public int jakisInt(int x) {
        return x*2;

    }

    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println("Hello: " + i + " Thread: " +
                    Thread.currentThread().getName());
            //silnia(i)
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = scan.nextInt();
        System.out.println( " Thread: " +  Thread.currentThread().getName() + " liczba * 2 = " + jakisInt(x));

    }
}


public class Main {

    public static void main(String[] args) {

        //opcja 1 -wsza ..

                //	Thread thread = new Thread(new Runner());
                //	Thread thread1 = new Thread(new Runner());
                //        Thread thread2 = new Thread(new Runner());
                //        Thread thread3 = new Thread(new Runner());
                //	thread.start();
                //	thread1.start();
                //	thread2.start();
                //	thread3.start();

        // opcja 2 ga rozszerzamy inne podejscie:

//        Runnerexample runnerExample = new Runnerexample();
//        runnerExample.start();

//        Runnerexample runnerExample1 = new Runnerexample();
//        runnerExample1.start();
//
//        Runnerexample runnerExample2 = new Runnerexample();
//        runnerExample2.start();

        //opcja III - z klasą anonimomwa - obiekt ktorego nie tworzymy ?

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i=0; i<50; i++){
                    System.out.println("Hell - O: " + i + " Thread: " +
                            Thread.currentThread().getName());
                     }
            }
        });

       // thread.start();

         Thread thread10 = new Thread(new Runner());
         thread10.start();

        Thread thread11 = new Thread(new Runner());
        thread11.start();


        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runnerexample2 runnerExampleD = new Runnerexample2();
        runnerExampleD.start();

    }
}
