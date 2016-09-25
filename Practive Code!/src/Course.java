import java.util.ArrayList;
/**
 * 
 * Code that shows the utility of ArrayLists
 * An ArrayList is a Java data structure that holds a list 
 * of objects.  Here it is used to manage a collection of Student
 * objects.
 * An ArrayList has methods that allow you to add, remove, search 
 * and iterate through its values	
 */

public class Course {

	private String courseName;
	// the list of students in the course is maintained using an ArrayList:
	private ArrayList<Student> students;

	public Course(String courseName){
		this.courseName = courseName;
		// make an empty list of students: 
		students = new ArrayList<Student>();
	}

	public String getCourseName() {
		return courseName;
	}
	
	public int size() {
		return students.size();
	}
	
	/**
	 * Add a student to the course if not already there
	 *  @param student student to add
	 *  @return whether student was added
	 */
	public boolean add(Student student){

		if (!students.contains(student)){
			students.add(student);
			return true;
		}
		return false;
	}
	
	/**
	 * remove a student from the course
	 * @param student to remove
	 */
	public void remove(Student student){
		students.remove(student);
	}
	
	/**
	 * removes the student with index i
	 * @param i: index of student to remove
	 */
	public void remove(int i){
		students.remove(i);
	}
	
	/**
	 * returns the student with index i in the database
	 * @param i
	 * @return get the student with index i
	 */
	public Student getStudent(int i){
		return students.get(i);
	}
	
	/**
	 * searches for a student 
	 * @param student a student object
	 * @return the index at which a student occurs in the database
	 */
	
	public int indexOf(Student student){
		return students.indexOf(student);
	}
	
	public boolean contains(Student student) {
		return students.contains(student);
	}
	public String toString(){
		String res = "course: " + courseName + "  number of students: " + size();
		for (Student s: students) {
			res = res + "\n" + s;
		}
		// alternative implementation:
		//res = res + "\n" + students;
        return res;
	}

	/**
	 *  
	 *  @param other Another Course object
	 *  @return a Course object that contains the students that are in both courses
	 */	
	public Course intersect(Course other){
		Course intersection = new Course("intersection");
		for (Student s: students) {
			if (other.contains(s)) {
				intersection.add(s);
			}
		}
		return intersection;
	}
	
	public static void main(String[] args) {
		
		Course course = new Course("cs161");
		
		Student jim = new Student("Jim", "1234");
		Student jane = new Student("Jane", "5678");
		Student aaron = new Student("Aaron", "2576");
		Student zeke = new Student("Zeke", "8382");
		Student mary = new Student("Mary", "8283");
		course.add(jim);
		course.add(jane);
		course.add(aaron);
		course.add(zeke);
		course.add(mary);
		
		System.out.println(course);

		System.out.println("contains Jim: " + course.contains(jim));
		System.out.println("contains Jim: " + course.students.contains(jim));

		System.out.println("indexOf Jim: " + course.students.indexOf(jim));
		Student otherJim = new Student(jim);
		System.out.println("indexOf otherJim: " + course.indexOf(otherJim));
		
		System.out.println("Attempting to insert Aaron again");
		if (course.add(aaron)){
			System.out.println( "**ERROR Aaron is inserted but is already in student database");
		}
		else {
			System.out.println("OK Aaron not inserted again");
		}
		
		course.remove(1);
		System.out.println(course);
		
		Course course2 = new Course("cs192");
		
		course2.add(jim);
		course2.add(jane);
		System.out.println(course2);
		
		Course course3 = course.intersect(course2);
		System.out.println(course3);
		
	}
}
