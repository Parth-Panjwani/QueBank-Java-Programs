//Write a Program to demonstrate Stack class. Perform insert, delete and access operation.
//By: Parth Panjwani
import java.util.*;
class Que50 { 
    public static void main(String[] args) { 
        Stack<String> s = new Stack<String>(); 
        s.push("A"); 
        s.push("B"); 
        s.push("C"); 
        s.push("D"); 
        s.push("E"); 
        s.push("F"); 
        s.push("G"); 
        s.push("H"); 
        s.push("I"); 
        s.push("J"); 
        s.push("K"); 
        s.push("L"); 
        s.push("M"); 
        s.push("N"); 
        s.push("O"); 
        s.push("P"); 
        s.push("Q"); 
        s.push("R"); 
        s.push("S"); 
        s.push("T"); 
        s.push("U"); 
        s.push("V"); 
        s.push("W"); 
        s.push("X"); 
        s.push("Y"); 
        s.push("Z"); 
        System.out.println("Elements in Stack are: "); 
        while (!s.isEmpty()) { 
            System.out.println(s.pop()); 
        } 
        System.out.println("\nElements after deleting element at index 3: "); 
        s.pop(); 
        while (!s.isEmpty()) { 
            System.out.println(s.pop()); 
        } 
        System.out.println("\nElements after deleting element at index 5: "); 
        s.pop(); 
        while (!s.isEmpty()) { 
            System.out.println(s.pop()); 
        } 
        System.out.println("\nElements after deleting element at index 9: "); 
        s.pop(); 
        while (!s.isEmpty()) { 
            System.out.println(s.pop()); 
        } 
        System.out.println("\nElements after deleting element at index 15: ");
}
}