//Write a program to accept a line and check how many consonants and vowels are there in line.
//By: Parth Panjwani
import java.util.*;
class Que13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String line = sc.nextLine();
        int vowels = 0, consonants = 0;
        for(int i = 0; i < line.length(); i++)
        {
            if(line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u')
            {
                vowels++;
            }
            else
            {
                consonants++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }
}