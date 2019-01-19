package pl.sda.watki;

import java.util.Scanner;

public class Runnerexample2 extends Thread{

    @Override
    public void run() {

        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = scan.nextInt();
        System.out.println( " Thread: " +  Thread.currentThread().getName() + " liczba * 2 = " + jakisInt(x));

    }

    public int jakisInt(int x) {
        return x*2;

    }


}