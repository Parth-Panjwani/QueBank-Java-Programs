//Write a program to generate even numbers between 30 to 50 and store it in array only if it is odd.
 //By: Parth Panjwani
class Que16
{
    public static void main(String[] args)
    {
        int[] a = new int[10];
        int count = 0;
        for(int i = 30; i <= 50; i++)
        {
            if(i%2 != 0)
            {
                a[count] = i;
                count++;
            }
        }
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

    }
}