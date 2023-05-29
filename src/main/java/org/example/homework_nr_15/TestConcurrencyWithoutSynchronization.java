package org.example.homework_nr_15;

public class TestConcurrencyWithoutSynchronization {

    private int commonNum = 0;

    public static void main(String[] args) throws InterruptedException {
        TestConcurrencyWithoutSynchronization test = new TestConcurrencyWithoutSynchronization();
        test.increment();
    }

    public void increment () throws InterruptedException {
        Thread thread10 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                commonNum++;
            }
        });
        Thread thread11 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                commonNum++;
            }
        });

        thread10.start();
        thread11.start();
        thread10.join();
        thread11.join();
        System.out.println(commonNum);



    }
}
