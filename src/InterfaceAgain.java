interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, faster");
    }
}

class Developer
{
    // public void devApp(Laptop lap)
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

public class InterfaceAgain
{
    public static void main(String[] args)
    {
        Computer lap = new Laptop();
        Computer developer = new Desktop();

        Developer sourabh = new Developer();

        sourabh.devApp(lap);

    }
}