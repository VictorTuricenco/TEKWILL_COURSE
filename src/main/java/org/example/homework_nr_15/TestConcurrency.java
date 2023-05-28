package org.example.homework_nr_15;

public class TestConcurrency {

    private static int commonNum = 0;

           public static void main(String[] args) throws InterruptedException {

                Thread thread1 = new Thread (() -> {
                    Thread.currentThread().setName("Thread No 1");
                    System.out.println("Hello World! " + Thread.currentThread().getName());
                });
                Thread thread2 = new Thread(() -> {
                    Thread.currentThread().setName("Thread No 2");
                    System.out.println("Hello World! " + Thread.currentThread().getName());
                });
                Thread thread3 = new Thread(() -> {
                    Thread.currentThread().setName("Thread No 3");
                    System.out.println("Hello World! " + Thread.currentThread().getName());
                });
                Thread thread4 = new Thread(() -> {
                    Thread.currentThread().setName("Thread No 4");
                    System.out.println("Hello World! " + Thread.currentThread().getName());
                });

                Thread thread5 = new Thread(() -> {
                    Thread.currentThread().setName("Thread No 5");
                    System.out.println("Hello World! " + Thread.currentThread().getName());
                });

                thread1.start();
                thread2.start();
                thread3.start();
                thread4.start();
                thread5.start();

                Number num = new Number();

                Thread thread6 = new Thread(num);
                Thread thread7 = new Thread(num);

                thread6.start();
                thread7.start();
                thread6.join();
                thread7.join();
                System.out.println(commonNum);

            }
            static class Number extends Thread {

                @Override
                public synchronized void run() {
                    for (int i = 0; i < 1000000; i++) {
                        commonNum++;
                    }
                }
            }
        }




