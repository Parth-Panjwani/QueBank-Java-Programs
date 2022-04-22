/*Write a program to demonstrate method overloading by writing a test method which has no inputs and prints no input.
a) Accepts an integer and prints it.
b) Accepts 2 integers and prints.
c) Accepts a number of type double. Calculate its square and print it. */
//By: Parth Panjwani
class Que21 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 20; 
        double c = 10.5; 
        print(a); 
        print(a, b); 
        print(c); 
    } 
    public static void print(int a) { 
        System.out.println("a: "+a); 
    } 
    public static void print(int a, int b) { 
        System.out.println("a: "+a+" b: "+b); 
    } 
    public static void print(double c) { 
        System.out.println("c: "+c*c); 
    } 
}