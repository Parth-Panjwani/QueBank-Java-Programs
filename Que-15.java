//Write a program to find that given number or string is palindrome or not.
//By: Parth Panjwani
import java.util.*; 
class Que15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or string: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--)
        {
            rev += str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}