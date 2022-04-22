//WAP to demonstrate instanceof operator to check determine whether Mammal is actually an Animal, and dog is actually an Animal. Use Animal as interface, mammal is inherited from animal, dog extends Mammal.
//By: Parth Panjwani
class Animal
{
    public void eat()
    {
        System.out.println("Animal eats");
    }
}
class Mammal extends Animal
{
    public void eat()
    {
        System.out.println("Mammal eats");
    }
}
class Dog extends Mammal
{
    public void eat()
    {
        System.out.println("Dog eats");
    }
}
class Que36 { 
    public static void main(String[] args) { 
        Animal a = new Animal(); 
        Mammal m = new Mammal(); 
        Dog d = new Dog(); 
        if (a instanceof Animal) { 
            System.out.println("a is an Animal"); 
        } 
        if (m instanceof Animal) { 
            System.out.println("m is an Animal"); 
        } 
        if (d instanceof Animal) { 
            System.out.println("d is an Animal"); 
        } 
        if (d instanceof Mammal) { 
            System.out.println("d is a Mammal"); 
        } 
        if (d instanceof Dog) { 
            System.out.println("d is a Dog"); 
        } 
    } 
}