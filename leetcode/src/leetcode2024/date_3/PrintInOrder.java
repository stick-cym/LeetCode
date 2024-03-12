package leetcode2024.date_3;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintInOrder {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = () -> System.out.println(1);
        Runnable runnable2 = () -> System.out.println(2);
        Runnable runnable3 = () -> System.out.println(3);
        new Foo().third(runnable1);
        new Foo().first(runnable2);
        new Foo().second(runnable3);

    }
}
class Foo {
    private AtomicInteger firstJobDone=new AtomicInteger(0);
    private AtomicInteger secondJobDone=new AtomicInteger(0);
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstJobDone.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(firstJobDone.get()!=1){
            System.out.println("卡在第二");
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();

        secondJobDone.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(secondJobDone.get()!=1){
            System.out.println("卡在第三");
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
