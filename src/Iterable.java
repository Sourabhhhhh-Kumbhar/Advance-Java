import java.util.ArrayList;
import java.util.List;

public class Iterable
{
    public static void printNames(List<String> names)
    {
        for(String name : names)
            {
            System.out.println(name);
            }
    }

}

public static void main (String[] args)
{
    List<String> names = new ArrayList<>();

    names.add("Sourabh");
    names.add("Anikaa");
    names.add("Radha");

    Iterable.printNames(names);
}

