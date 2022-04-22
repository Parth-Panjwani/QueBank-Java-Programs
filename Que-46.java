//Write a program using BufferedInputStream, FileInputStream, BufferedOutputStream, FileOutputStream to copy Content of one file File1.txt into another file File2.txt.
//By: Parth Panjwani
import java.io.*;
class Que46 { 
    public static void main(String[] args) throws IOException { 
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("File1.txt")); 
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("File2.txt")); 
        int i; 
        while ((i = bis.read()) != -1) { 
            bos.write(i); 
        } 
        bis.close(); 
        bos.close(); 
    } 
}