package com.goinhn.healer.test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        return 100;
    }

    public static void main(String[] args) throws Exception {
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(myCallable);
        Thread thread = new Thread(ft);
        thread.start();
    }
}
