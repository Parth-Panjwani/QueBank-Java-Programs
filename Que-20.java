//Create a Class called Rectangle having an attribute length and breadth, it has two Methods to calculate the area and parameter of the Rectangle, write a program to test the Class Rectangle by creating at least two Rectangles.
//By: Parth Panjwani
class Rectangle
{
    int length, breadth;
    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
    void area()
    {
        System.out.println("Area of rectangle: "+length*breadth);
    }
    void perimeter()
    {
        System.out.println("Perimeter of rectangle: "+2*(length+breadth));
    }
}
class Que20
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(10,20);
        r1.area();
        r1.perimeter();
        Rectangle r2 = new Rectangle(20,30);
        r2.area();
        r2.perimeter();
    }
}