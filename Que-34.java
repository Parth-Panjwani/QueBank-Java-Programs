//Write a program that accepts 2 integers x and y and computes z=x/y. Create an exception using throws which checks if z is less then 10 and if yes it prints number is too small catch exception using throw. Also add finally block that prints the sum of x and y. 
//By: Parth Panjwani
class Que34 { 
    public static void main(String[] args) { 
        int x = 10; 
        int y = 5; 
        int z = 0; 
        try { 
            z = x/y; 
            if (z < 10) { 
                throw new Exception("Number is too small"); 
            } 
            System.out.println("Z: "+z); 
        } 
        catch(Exception e) { 
            System.out.println(e); 
        } 
        finally { 
            System.out.println("Sum of x and y: "+(x+y)); 
        } 
    } 
}