//Create a class called Student. Write a student manager program to manipulate the student information from files by using FileInputStream and FileOutputStream.
//By: Parth Panjwani
import java.io.*;
class Student {
    String name;
    int rollno;
    String address;
    int marks;
    public Student(String name, int rollno, String address, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
        this.marks = marks;
    }
    public String toString() {
        return "Name: " + name + "\nRoll No: " + rollno + "\nAddress: " + address + "\nMarks: " + marks;
    }
}
class Que47 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Student.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Student.txt"));
        String s;
        while ((s = br.readLine()) != null) {
            String[] arr = s.split(" ");
            Student st = new Student(arr[0], Integer.parseInt(arr[1]), arr[2], Integer.parseInt(arr[3]));
            bos.write(st.toString().getBytes());
        }
        bis.close();
        bos.close();
    }
}