class ThreadLife extends Thread {

    public void run()
    {
        System.out.println(getName() + "is now in Running State");
        try{
            Thread.sleep(1000); //Moves to Timed_Waiting State
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println(getName() + "Finished Execution");
    }
}

public class ThreadLifecycle
{
    public static void main(String[] args) throws InterruptedException
    {
        ThreadLife t1 = new ThreadLife();

        //State 1 : NEW - Thread Created But Not Started
        System.out.println("State after Creation: " + t1.getState());

        t1.start();

        //State 2 : RUNNABLE - started waiting for CPU or running
        System.out.println("State after start(): " + t1.getState());

        Thread.sleep(200); //Give t1 time to enter sleep()

        //State 3 : TIMED_WAITING - currently inside Thread.sleep()
        System.out.println("State while sleeping: " + t1.getState());

        t1.join(); //Main thread waits here until t1 finishes

        //State 4 : TERMINATED - finished execution
        System.out.println("State after completion: " + t1.getState());
    }
}