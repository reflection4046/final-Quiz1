import java.io.IOException;

public class App {
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.setId(122);
		s1.setName("Nahid");
		s1.setCgpa(3.88);
		System.out.println(s1);
		
		Student s2 = new Student();
		s2.setId(123);
		s2.setName("Islam");
		s2.setCgpa(3.90);
		System.out.println(s2);
		
		try {
			SerializationFunction.serialize("student.txt", s1);
			SerializationFunction.serialize("student2.txt", s2);
			Student student = (Student) SerializationFunction.deSerialize("student.txt");
			Student student2 = (Student) SerializationFunction.deSerialize("student2.txt");
			System.out.println(student);
			System.out.println(student2);
		} 
		catch (IOException exp) {
			exp.printStackTrace();
		} 
		catch (ClassNotFoundException exp) {
			exp.printStackTrace();
			}
		}
}