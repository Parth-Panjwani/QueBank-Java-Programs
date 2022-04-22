//Create two objects of employee and display ID, Name and salary (In double) pass the parameter through Constructor.
//By: Parth Panjwani
class Employee
{
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
class Que17
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(1,"Raj",10000);
        Employee e2 = new Employee(2,"Ravi",20000);
        e1.display();
        e2.display();
    }
}