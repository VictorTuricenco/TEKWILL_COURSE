package org.example.homework_nr_15;

public class WaitNotify {
    public static Integer commonNum = 0;
    public static final Object sync = new Object();
    public static boolean taskCompleted = false;

    public static void main(String[] args) throws InterruptedException {


        Thread thread9 = new Thread(new Count());
        Thread thread10 = new Thread(new PrintOut());

        thread9.start();
        thread10.start();
    }
}

class Count implements Runnable {
    @Override
    public void run() {
        synchronized (WaitNotify.sync) {
            for (int i = 0; i < 1000000; i++) {
                WaitNotify.commonNum++;
            }
            WaitNotify.taskCompleted = true;
            WaitNotify.sync.notifyAll();
            }

        }
    }


class PrintOut implements Runnable {
    @Override
    public void run() {
        synchronized (WaitNotify.sync) {
            while (!WaitNotify.taskCompleted) {
                try {
                    WaitNotify.sync.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
                System.out.println(WaitNotify.commonNum);
            WaitNotify.sync.notifyAll();
            }
        }
    }

