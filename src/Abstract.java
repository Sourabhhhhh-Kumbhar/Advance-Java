abstract class Animal
{
    //Abstract Method
    abstract void makeSound();

    //Normal Method (Concrete Method)
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Dog is Barking");
    }
}

class Cat extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Cat is Meowing");
    }
}

public class Abstract
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.makeSound();
        d.eat();

        Cat c = new Cat();
        c.makeSound();
        c.eat();
    }
}
