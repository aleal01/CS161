import java.util.ArrayList;

public class Transcript {

    private ArrayList<Course> courses;

    public Transcript() {
	courses = new ArrayList<Course>();
    }

    public void add(Course course) {
	courses.add(course);
    }

    @Override
    public String toString() {
	String str = "";
	for (Course s : courses) 
	    str += s + "\n";
	return str;
    }

    public static void main(String[] args) {
	Transcript transcript = new Transcript();

	transcript.add(new CS(161,"fall",2015,95.2));
	transcript.add(new CS(270,"spring",2016,86.2));
	transcript.add(new IndStudy(222,"summer",2016,"U"));
	transcript.add(new CS(200,"fall",2016,81.2));
	System.out.println(transcript);

	CS c = (CS) transcript.courses.get(1);
	c.setGrade(c.getGrade() + 2);
	System.out.println(transcript);
    }
}
