/*Write a program to calculate the following i. Find the length of array. ii. Demonstrate a one-dimensional array. iii. Demonstrate a two-dimensional array. iv. Demonstrate a multi-dimensional array.*/
//By: Parth Panjwani
class Que12
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {1,2,3,4,5,6,7,8,9,10};
        int[][] c = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        System.out.println("Length of array a: "+a.length);
        System.out.println("Length of array b: "+b.length);
        System.out.println("Length of array c: "+c.length);
        System.out.println("Length of array c[0]: "+c[0].length);
        System.out.println("Length of array c[1]: "+c[1].length);
    }
}