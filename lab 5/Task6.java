import java.util.*;
class Task6{
public static void main(String abc[]){
Scanner sc=new Scanner(System.in);
    System.out.println("Name\t\tRol#\tDepartment\tAge");
    Student s1=new Student("Muhammad Asim","18SW24","Software",18);
    s1.showData();
    s1.setmarks(70,80,85);
    s1.percentage();
    s1.ShowData();
}
}