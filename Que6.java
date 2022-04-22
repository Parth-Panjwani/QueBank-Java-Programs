//Write java program to perform 4 basic mathematical operations on two numbers enter the numbers through command line argument. 
//By: Parth Panjwani
public class Que6 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        System.out.println("Addition is " + c);
        System.out.println("Subtraction is " + d);
        System.out.println("Multiplication is " + e);
        System.out.println("Division is " + f);
    }
}
