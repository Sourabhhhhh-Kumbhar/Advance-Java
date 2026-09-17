public class ThreadMethods
{
    static class MyThread extends Thread
    {
        @Override
        public void run()
        {
            for (int i = 1; i <= 3; i++)
            {
                System.out.println(getName() + " -> step " + i);

                try{
                    Thread.sleep(300);
                }
                catch (InterruptedException e)
                {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Worker A");
        t2.setName("Worker B");

        System.out.println("t1 name: " + t1.getName());

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Is t1 alive before start? " + t1.isAlive());

        t1.start();
        t2.start();

        System.out.println("Is t1 alive after start? " + t1.isAlive());

        t1.join();
        t2.join();

        System.out.println("Is t1 alive after join? " + t1.isAlive());

        System.out.println("Main thread done.");
    }
}
