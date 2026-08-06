enum Animall
{
    DOG,
    CAT,
    FISH;

    public void sound()
    {

        switch (this)
        {
            case DOG:
                System.out.println("Bark");
                break;

            case CAT:
                System.out.println("Meow");
                break;

            case FISH:
                System.out.println("Bark");
                break;
        }

    }
}

public class EnumMethod
{
    public static void main(String[] args)
    {
        Animall.FISH.sound();
    }
}