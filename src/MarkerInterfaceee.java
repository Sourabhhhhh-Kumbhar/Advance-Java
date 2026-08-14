interface Printableeeee
{
    // No Methods
}
class Student implements Printableeeee
{
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class MarkerInterfaceee
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Sam", 18);
        s1.display();

        if (s1 instanceof Student)
        {
            System.out.println("This is a Printableeee");
        }
    }
}

