//Write a program to find length of string and print second half of the string.
//By: Parth Panjwani
import java.util.*;
class Que14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String line = sc.nextLine();
        int len = line.length();
        System.out.println("Length of string: "+len);
        System.out.println("Second half of string: "+line.substring(len/2));
    }
}