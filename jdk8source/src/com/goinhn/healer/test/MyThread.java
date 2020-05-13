package com.goinhn.healer.test;

import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;

public class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println(1);
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }


}
