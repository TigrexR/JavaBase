package com.javaBase.controller;

import org.junit.Test;
import org.junit.runner.notification.RunListener;

@RunListener.ThreadSafe
public class ThreadTest {

    @Test
    public void syncTest(){

        System.out.println("hello thread!");

    }

    @Test
    public static void main(String[] args) {
        System.out.println("The main method was executed by thread:"
                + Thread.currentThread().getName());
        Helper helper = new Helper("Java Thread AnyWhere");
        helper.run();
    }

    static class Helper implements Runnable {
        private final String message;

        public Helper(String message) {
            this.message = message;
        }

        private void doSomething(String message) {
            System.out.println("The doSomething method was executed by thread:"
                    + Thread.currentThread().getName());
            int i = 0;
            while (true){
                ++i;
                System.out.println(i);
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("isInterrupted");
                    break;
                }
                Thread.yield();
            }
            System.out.println("Do something with " + message);
        }

        @Override
        public void run() {
            System.out.println("开始运行helper 类中的run！");
            doSomething(message);
        }

        
    }

}
