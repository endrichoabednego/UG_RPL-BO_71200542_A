package com.ug3.soal2;



import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class UG3Soal2 {
    public static void main(String[] args) {
        final ScheduledExecutorService waktuberhenti = Executors.newScheduledThreadPool(1);
        System.out.println("Lampu merah menyala selama");
        final Runnable runnable = new Runnable() {
            int lampumerahnyala = 20;
            int lampukuningnyala = 2;
            int lampuhijaunyala = 15;

            public void run() {

                System.out.println(lampumerahnyala);
                lampumerahnyala--;
                if (lampumerahnyala < 1) {
                    System.out.println("Akan berganti ke lampu kuning");
                    System.out.println(lampukuningnyala);
                    lampukuningnyala--;
                }
                    if (lampukuningnyala < 1) {
                        System.out.println("Akan berganti ke lampu hijau");
                        System.out.println(lampuhijaunyala);
                        lampuhijaunyala--;
                        waktuberhenti.shutdown();
                    }



            }

        };
        waktuberhenti.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
    }
}





