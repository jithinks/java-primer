package com.jks.startup.thread;

import java.util.concurrent.*;

public class Executor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("Runnable - Asynchronous task");
            }
        });
        executorService.shutdown();


        executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(new Callable<Object>() {
            public Object call() throws Exception {
                System.out.println("Callable - Asynchronous task");
                return "callable completed";
            }
        });
        executorService.shutdown();
        try {
            System.out.println("Future get:"+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
