//Using a try and a catch block detect a divide by zero exception and catch block prints divide by zero encounter. 
//By: Parth Panjwani
class Que30 { 
    public static void main(String[] args) { 
        try { 
            int a = 10; 
            int b = 0; 
            int c = a/b; 
            System.out.println(c); 
        } 
        catch(ArithmeticException e) { 
            System.out.println("Divide by zero encounter"); 
        } 
    } 
}