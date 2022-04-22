//Write a Program to demonstrate ArrayList class. Perform insert, delete and access operation.
//By: Parth Panjwani 
import java.util.*;
 class Que49{
        public static void main(String[] args) {
            ArrayList<String> al = new ArrayList<String>();
            al.add("A");
            al.add("B");
            al.add("C");
            al.add("D");
            al.add("E");
            al.add("F");
            al.add("G");
            al.add("H");
            al.add("I");
            al.add("J");
            al.add("K");
            al.add("L");
            al.add("M");
            al.add("N");
            al.add("O");
            al.add("P");
            al.add("Q");
            al.add("R");
            al.add("S");
            al.add("T");
            al.add("U");
            al.add("V");
            al.add("W");
            al.add("X");
            al.add("Y");
            al.add("Z");
            System.out.println("Elements in ArrayList are: ");
            for(String s: al) {
                System.out.println(s);
            }
            System.out.println("\nElements after deleting element at index 3: ");
            al.remove(3);
            for(String s: al) {
                System.out.println(s);
            }
            System.out.println("\nElements after deleting element at index 5: ");
            al.remove(5);
            for(String s: al) {
                System.out.println(s);
            }
            System.out.println("\nElements after deleting element at index 9: ");
            al.remove(9);
            for(String s: al) {
                System.out.println(s);
            }
            System.out.println("\nElements after deleting element at index 15: ");
        }
 }