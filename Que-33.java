//Define 3 integer variables a, b, c whose values are 10 , 5, 5 respectively. Compute X=a/(b-c). Catch divide by 0 exception and compute y=a/(b+c) and print the value of y.
//By: Parth Panjwani
class Que33{ 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int c = 5; 
        int x = 0; 
        int y = 0; 
        try { 
            x = a/(b-c); 
            y = a/(b+c); 
            System.out.println("X: "+x); 
            System.out.println("Y: "+y); 
        } 
        catch(ArithmeticException e) { 
            System.out.println("Divide by zero encounter"); 
        } 
    } 
}