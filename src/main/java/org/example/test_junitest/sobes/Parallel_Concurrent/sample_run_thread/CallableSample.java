package org.example.test_junitest.sobes.Parallel_Concurrent.sample_run_thread;



import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 3. имплементим от Callable и реализуем его метод call()
// параметр в интерфейсе тип воозворащаемого значения
public class CallableSample implements Callable<String> {
    boolean test = false;

    @Override
    public String call() throws Exception {
        if (test) {
            throw new IOException("error during task processing...");
        }
        System.out.println("task in processing... " );
        return "result  " + LocalDateTime.now();
    }

    public static void main(String[] args) {
        //создавем ExecutorService на базе пула из 5 потоков
        ExecutorService es1 = Executors.newFixedThreadPool(5);
        //поместить задачу в очередь на выполнение
        Future<String> f1 = es1.submit(new CallableSample());
        while(!f1.isDone()){
            //ждем пока поток не выполнится
        }

        try {
            // получить результа выполнения программы
            System.out.println("Task has completed : " + f1.get());

        } catch (InterruptedException ie) {
            ie.printStackTrace(System.err);
        } catch (ExecutionException ee) {
            ee.printStackTrace(System.err);
        }
        es1.shutdown();

    }
}
