//Write a Program to demonstrate Vector class. Perform insert, delete and access operation.
//By: Parth Panjwani
import java.util.*;
class Que48{ 
    public static void main(String[] args) { 
        Vector<String> v = new Vector<String>(); 
        v.add("A"); 
        v.add("B"); 
        v.add("C"); 
        v.add("D"); 
        v.add("E"); 
        v.add("F"); 
        v.add("G"); 
        v.add("H"); 
        v.add("I"); 
        v.add("J"); 
        v.add("K"); 
        v.add("L"); 
        v.add("M"); 
        v.add("N"); 
        v.add("O"); 
        v.add("P"); 
        v.add("Q"); 
        v.add("R"); 
        v.add("S"); 
        v.add("T"); 
        v.add("U"); 
        v.add("V"); 
        v.add("W"); 
        v.add("X"); 
        v.add("Y"); 
        v.add("Z"); 
        System.out.println("Elements in Vector are: "); 
        for (String s : v) { 
            System.out.println(s); 
        } 
        System.out.println("\nElements after deleting element at index 3: "); 
        v.remove(3); 
        for (String s : v) { 
            System.out.println(s); 
        } 
        System.out.println("\nElements after deleting element at index 5: "); 
        v.remove(5); 
        for (String s : v) { 
            System.out.println(s); 
        } 
        System.out.println("\nElements after deleting element at index 9: "); 
        v.remove(9); 
        for (String s : v) { 
            System.out.println(s); 
        } 
        System.out.println("\nElements after deleting element at index 15: ");
}
}