import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile

{
     
	public static void WriteStudent1(String n, int i, double c)
	
	{
	
	File file = new File("src\\Student1.txt");
	
	try {
		PrintWriter out = new PrintWriter(file);
		out.println(" Student 1 Name : "+n);
		out.println(" Student 1 Id  : "+i);
		out.println(" Student 1 CGPA : "+c);
		out.close();
	} 
	
	catch (FileNotFoundException e) 
	{
		e.printStackTrace();
	}
	
	
	}
	
	
    public static void WriteStudent2(String name, int id, double cgpa)
	
	{
	
	File file = new File("src\\Student2.txt");
	
	try {
		PrintWriter out = new PrintWriter(file);
		out.println(" Studen 2 Name : "+name);
		out.println(" Student 2 ID  : "+id);
		out.println(" Student 2 CGPA : "+cgpa);
		out.close();
		
	} 
	catch (FileNotFoundException e) 
	{
		e.printStackTrace();
	}
	
	
	}
}




