interface Normal
{
    void sound();
    void eat();
}

class Dogg implements Normal
{
    @Override
    public void sound()
    {
        System.out.println("Dogg Barks");
    }

    @Override
    public void eat()
    {
        System.out.println("Dogg Eating Foods");
    }
}

public class NormalInterface
{
    public static void main(String[]args)
    {
        Dogg d = new Dogg();

        d.sound();
        d.eat();
    }
}