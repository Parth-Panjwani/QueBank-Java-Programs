//Create a Class called triangle having an attribute length and breadth, it has two Methods to calculate the area and perimeter of the triangle, write a program to test the Class triangle by creating at least two triangles.
//By: Parth Panjwani
class Triangle
{
    int length, breadth;
    Triangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
    void area()
    {
        System.out.println("Area of triangle: "+0.5*length*breadth);
    }
    void perimeter()
    {
        System.out.println("Perimeter of triangle: "+2*(length+breadth));
    }
}
class Que19
{
    public static void main(String[] args)
    {
        Triangle t1 = new Triangle(10,20);
        t1.area();
        t1.perimeter();
        Triangle t2 = new Triangle(20,30);
        t2.area();
        t2.perimeter();
    }
}