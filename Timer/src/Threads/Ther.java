package Threads;

public class Ther {
    public static void main(String[] args){
        System.out.println("main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(() -> System.out.println("I do not")).start();
        System.out.println("Hello again from main thread");


    }
}
