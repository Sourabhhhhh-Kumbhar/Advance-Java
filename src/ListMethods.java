import java.util.ArrayList;
import java.util.List;

public class ListMethods
{
    //Method to create and return list
    public static List<String> createList()
    {
        List<String> list = new ArrayList<>();

        list.add("Sourabh");
        list.add("Anikaa");
        list.add("Nishaa");
        list.add("Suhana");
        list.add("Karan");

        return list;
    }

    //Method to display the list
    public static void displayList(List<String> list)
    {
        System.out.println("List : " + list);
    }

    //Method to access an element
    public static void accessElement(List<String> list)
    {
        System.out.println("Element at index 1: " + list.get(1) );
    }

    //Method to add element
    public static void addElement(List<String> list)
    {
        System.out.println("Usha");
    }

    //Method to remove element
    public static void removeElement(List<String> list)
    {
        System.out.println("Karan");
    }

    //Method to check whether an element exists
    public static void checkElement(List<String> list)
    {
        System.out.println("Contains Anikaa: " +  list.contains("Anikaa"));
    }

    //Method to display size
    public static void displaySize(List<String> list)
    {
        System.out.println("Size : " + list.size());
    }


    public static void main(String[] args)
    {
        List<String> list = createList();
        displayList(list);

        accessElement(list);

        addElement(list);
        displayList(list);

        removeElement(list);
        displayList(list);

        checkElement(list);

        displaySize(list);
    }

}