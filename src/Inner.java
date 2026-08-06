class Outer
{
    void Display()
    {
        System.out.println("This is Outer class");
    }

    class Inner
    {
        void Show()
        {
            System.out.println("This is Inner class");
        }
    }
}

public class Inner
{
    public static void main(String[] args)
    {
        Outer obj = new Outer();
        obj.Display();

        Outer.Inner in = obj.new Inner();
        in.Show();
    }
}