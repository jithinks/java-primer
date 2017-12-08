package com.jks.startup.thread.futuretask;

import java.util.concurrent.Callable;

public class CallableClass implements Callable<String> {

    private long waitTime;

    public CallableClass(int timeInMillis){
        this.waitTime=timeInMillis;
    }
    public String call() throws Exception {
        Thread.sleep(waitTime);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }
}
