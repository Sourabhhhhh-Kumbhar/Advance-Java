interface Payment
{
    void pay();
}

class UPI implements Payment
{
    public void pay()
    {
        System.out.println("UPI Payment");
    }
}

class CreditCard implements Payment
{
    public void pay()
    {
        System.out.println("Credit Card Payment");
    }
}

public class Interface
{
    public static void main(String[] args)
    {
        Payment p = new UPI();
        Payment p2 = new CreditCard();

        p.pay();
        p2.pay();
    }
}

