// ThreadMethodsBasic.java
// Only: start(), run(), sleep(ms), join(), getName()/setName(), isAlive(), setPriority()

public class ThreadMethods {

    static class MyThread extends Thread {

        @Override
        public void run() {
            // run() holds the code that executes when the thread starts
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " -> step " + i);
                try {
                    Thread.sleep(300); // sleep(ms): pause this thread for 300 milliseconds
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Worker-1");   // setName(): assign a custom name to the thread
        t2.setName("Worker-2");

        System.out.println("t1 name: " + t1.getName()); // getName(): read the thread's name

        t1.setPriority(Thread.MAX_PRIORITY); // setPriority(): hint scheduler (1-10, default 5)
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Is t1 alive before start? " + t1.isAlive()); // false, not started yet

        t1.start(); // start(): creates a new thread and calls run() on it
        t2.start();

        System.out.println("Is t1 alive after start? " + t1.isAlive()); // likely true, still running

        t1.join(); // join(): main thread waits here until t1 finishes
        t2.join(); // then waits until t2 finishes

        System.out.println("Is t1 alive after join? " + t1.isAlive()); // false, finished

        System.out.println("Main thread done.");
    }
}