package com.DSAQueue.CustomQueues;

public class TestCustomQueue
{
    public static void main(String[] args) throws Exception {
//        CircularQueue queue = new CircularQueue(5);
//
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//
//        queue.display();
//
//        queue.remove();
//        queue.insert(133);
//        queue.display();
//        System.out.println(queue.front());

//        CustomQueueReTest queue = new CustomQueueReTest(5);
//
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//
//        System.out.println("removed item: "+queue.remove());
//        System.out.println("removed item: "+queue.remove());
//
//        System.out.println("Current item at front: "+queue.front());
//
//        queue.display();

        DynamicQueue queue = new DynamicQueue(5);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        System.out.println(queue.remove());

        queue.insert(6);

        queue.display();

        System.out.println(queue.remove());

        queue.insert(13);

        queue.display();

        System.out.println(queue.remove());

        queue.insert(16);
        queue.insert(18);
        queue.insert(19);
        queue.insert(164);

        queue.display();



    }
}
