package net.xdclass.demoproject.task;

import net.xdclass.demoproject.domain.User;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
@Async
public class AsyncTask {


    public void task1(){
        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task1");
    }

    public void task2(){
        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task2");
    }

    public void task3(){
        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task3");
    }

    public Future<String> task4(){
        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task4");
        return new AsyncResult<String>("task4");
    }

    public Future<String> task5(){
        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task5");
        return new AsyncResult<String>("task5");
    }

}
