public class Task1
{
	public static void main(String []abcd)
	{
	String name;
	int totalmarks=1100,obtainedmarks;
	float percentage;
	char grade;
	boolean status;
	byte section;

	name="Muhammad Asim";

	obtainedmarks=843;
	percentage=(100*obtainedmarks/totalmarks);
	section='A';	

	if(percentage>=70)
		grade='A';
	else if(percentage>=60)
		grade='B';
	else if(percentage>=50)
		grade='C';
	else
		grade='F';

	if(percentage>=50)
	status=true;
	else
	status=false;
		
	System.out.println("Name= "+name);
	System.out.println("Total Marks= "+totalmarks);
	System.out.println("Obtain Marks= "+obtainedmarks);
	System.out.println("Percentage= "+percentage+"%");	
	System.out.println("Grade= "+grade);
	if(status==true)
	System.out.println("Status: Pass");
	else
	System.out.println("Status: Fail");


	}
}


