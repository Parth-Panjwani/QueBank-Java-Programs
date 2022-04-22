//Write a Java program to the find the following 1. Prime number checking 2. Sum of digit 
//By: Parth Panjwani
class Que9{ 
    public static void main(String[] args) { 
        int n = 5; 
        int sum = 0; 
        for (int i = 1; i <= n; i++) { 
            if (n % i == 0) { 
                sum = sum + i; 
            } 
        } 
        if (sum == 2 * n) { 
            System.out.println("Number is prime"); 
        } else { 
            System.out.println("Number is not prime"); 
        } 
    } 
}