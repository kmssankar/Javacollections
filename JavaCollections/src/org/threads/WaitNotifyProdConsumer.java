package org.threads;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer{

    private final Queue<Integer> queue = new LinkedList<>();
    private final int SIZE;

    public SharedBuffer(int size){
        this.SIZE = size;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while(queue.size() == SIZE){
            wait();
        }
        queue.add(value);
        System.out.println("Producer produced value: " + value);
        notifyAll();
    }


    public synchronized void consume() throws InterruptedException {

        while(queue.isEmpty()){
            System.out.println("Queue is empty");
            wait();
        }

        int value = queue.poll();
        System.out.println("Consumer consumed value: " + value);
        notifyAll();
    }
}

public class WaitNotifyProdConsumer {

   public static void main(String[] args) throws InterruptedException {

        SharedBuffer sharedBuffer = new SharedBuffer(3);

        Thread producerThread = new Thread(() -> {
            try {
                for(int i = 0; i < 10; i++) {
                    sharedBuffer.produce(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumerThread = new Thread(() -> {
           try {
               for(int i = 0; i < 10; i++) {
                   sharedBuffer.consume();
                   Thread.sleep(1000);
               }
           }catch (InterruptedException e){
               Thread.currentThread().interrupt();
           }
        });

        producerThread.start();
        consumerThread.start();
    }
}
