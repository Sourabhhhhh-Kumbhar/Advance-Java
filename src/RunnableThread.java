class C implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class D implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {

        // Just Runnable objects — these CANNOT run by themselves.
        // Calling obj1.run() would just execute it like a normal method (no new thread).
        C obj1 = new C();
        D obj2 = new D();

        Runnable r1 = new C();
        Runnable r2 = new D();

        // Anonymous Runnable — a Runnable implemented inline, no separate class needed
        Runnable r3 = new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hey");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // To actually get concurrency, wrap each Runnable in a Thread:
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        // NOW start them — this is what creates real, separate threads
        t1.start();
        t2.start();
        t3.start();
    }
}