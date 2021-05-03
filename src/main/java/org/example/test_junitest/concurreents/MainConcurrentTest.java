package org.example.test_junitest.concurreents;

import lombok.SneakyThrows;


import java.util.concurrent.*;
import java.util.concurrent.ExecutionException;

import static java.lang.Thread.sleep;

public class MainConcurrentTest {

    @SneakyThrows
    public static void main(String[] args) {
       MainConcurrentTest mmm = new MainConcurrentTest();
        mmm.acceptBoth();
    }
    private  void acceptBoth() throws ExecutionException, InterruptedException{
        final CompletableFuture<String> futureOne = CompletableFuture.supplyAsync(()->{
            System.out.println("Job one started");
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("job one is done");
            return "It's completed one";
        });
        final CompletableFuture<String> futureTwo = CompletableFuture.supplyAsync(()->{
            System.out.println("Job two started");
            try {
                sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("job two is done");
            return "It's completed two";
        });
        System.out.println("waiting....");
        futureOne.thenAcceptBothAsync(futureTwo,(result1, result2)->
            System.out.println(" result joined result: " + result1
                    + " " + result2));
        System.out.println("end ogogo");
    }
private void thenApplyException() throws ExecutionException, InterruptedException{
final CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
    System.out.println("Job started");
    try {
        sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("job done");
    return "It is completed";
}).thenApply(result->{
    System.out.println("apply result: "+ result);
    if(true) throw new RuntimeException("oops....");

    return result + "applied";

}).exceptionally(e->{
    System.out.println("wow exception, err:" + e.getMessage());
    return e.getMessage();
});
    System.out.println("waiting...");
    sleep(5000);
    String result = future.get();
    System.out.println("finished job, result: " + result);

}
    private  void thenApply() throws ExecutionException, InterruptedException{
        final CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            System.out.println("Job started");
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Job done");
            return"It first done |";
        }).thenApply(result->{
            System.out.println("Applay result: " + result);
            return result + " applied";
        });

        System.out.println("waiting...");
        sleep(5000);
        String result = future.get();
        System.out.println("finished job, result: " + result);
    }

    private void asyncRun() throws ExecutionException, InterruptedException {
        final CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("JOB START");
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("JOB IS DONE");
            return "It is completed";

        });
        System.out.println("waiting...");
        String result = future.get();
        System.out.println("finished job, result: " + result);
    }

    private void simpleRun() throws ExecutionException, InterruptedException {
        final CompletableFuture<String> future = new CompletableFuture<>();

        new Thread(() -> {
            System.out.println("Thread run, job started");
            try {
                sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            future.complete("future has come");
            System.out.println("job is done");
        }).start();
        System.out.println("waiting...");
        String result = future.get();
        System.out.println("finished job, result: " + result);

    }


}
