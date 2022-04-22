//WAP to demonstrate java inheritance. Write two classes namely calculation and My_calculation. Using extends keyword, the My_calculation inherits the methods addition() and subtraction() of calculation class. My_calculation.java has its own method multiplication.
//By: Parth Panjwani
class Calculation
{
    public int addition(int a, int b)
    {
        return a+b;
    }
    public int subtraction(int a, int b)
    {
        return a-b;
    }
}
class My_calculation extends Calculation
{
    public int multiplication(int a, int b)
    {
        return a*b;
    }
}
class Que26 {
    public static void main(String[] args) {
        My_calculation mc = new My_calculation();
        System.out.println("Addition: "+mc.addition(10,20));
        System.out.println("Subtraction: "+mc.subtraction(20,10));
        System.out.println("Multiplication: "+mc.multiplication(10,20));
    }
}