
import java.util.ArrayList;
		
public class Student {
	private String name;
	private String id;
	
	// constructor
	public Student (String name, String id)
	{
		this.name = name;
		this.id = id;
	}

	//copy constructor
	public Student (Student other)
	{
		this.name = other.name;
		this.id = other.id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getID(){
		return id;
	}
	
	public String toString()
	{
		return "name: " + name + " id: " + id;
	}

	public boolean equals(Object other){
		System.out.println("in equals(Object)");		
		boolean result = false;
        if (other instanceof Student) {
            Student otherStudent = (Student) other;
            result = id.equals(otherStudent.getID());
        }
        return result;
	}

	
	public static void main(String[] args){
		Student jim = new Student("Jim","1234");
		Student otherjim = new Student(jim);
		Student jane = new Student("Jane", "5678");

		System.out.println(jim);
		System.out.println(jane);
		System.out.println("jim equals other jim? " + jim.equals(otherjim));
		System.out.println("jim == other jim? " + (jim == otherjim));
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(jane);
		students.add(jim);
		System.out.println("students.contains(otherjim): " + students.contains(otherjim));
		

		
	}
}
