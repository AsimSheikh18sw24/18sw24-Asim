import java.util.*;
class Task1{
public static void main(String []abc){
    Scanner n= new Scanner(System.in);
    int c, os, ds;
System.out.print("Enter the marks of c++ out of 100");
c=n.nextInt();
System.out.print("\nEnter the marks of Data Structure out of 100");
ds=n.nextInt();
System.out.print("\nEnter the marks of Operating system out of 100");
os=n.nextInt();
int sum = c+ds+os;
double per=sum*100/300;
System.out.print("\nTotal numbers ="+ sum);    
System.out.print("\nPercentage    ="+ per);
    if (per>=90){System.out.print("\nGrade = A");}
    else if (per<90&&per>=80){System.out.print("\nGrade = B");}
    else if (per<80&&per>=70){System.out.print("\nGrade = C");}
    else if (per<70&&per>=60){System.out.print("\nGrade = E");}
    else if (per<60){System.out.print("\nGrade = Fail");}
}
}