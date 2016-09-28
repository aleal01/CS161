public class Course {

    protected int number;
    protected String semester;
    protected int year;
    
    public Course(int number, String semester, int year) {
	setNumber(number);
	setSemester(semester);
	setYear(year);
    }

    public int getNumber() {
	return number;
    }

    public void setNumber(int n) {
	number = n;
    }

    public String getSemester() {
	return semester;
    }

    public void setSemester(String s) {
	semester = s;
    }

    public int getYear() {
	return year;
    }

    public void setYear(int y) {
	year = y;
    }

    @Override
    public boolean equals(Object other) {
	if (this == other)
	    return true;
	if (! (other instanceof Course))
	    return false;
	Course otherCourse = (Course) other;
	return this.getNumber() == otherCourse.getNumber();
    }

    @Override
    public String toString() {
	return "Course(" + getNumber() + ",\"" + getSemester() + "\"," + getYear() + ")";
    }

    public static void main(String[] args) {
	Course a = new Course(444,"summer",1742);
	System.out.println("Should be Course(444,\"summer\",1742):   "+ a);

	Course b = new Course(444, "fall", 1800);
	System.out.println("equals test. Should be true.    " + a.equals(b));
	
	b.setNumber(333);
	System.out.println("setNumber and equals test. Should be false.    " + a.equals(b));
	
	b.setSemester("winter");
	b.setYear(2020);
	System.out.println("setSemester and setYear tests. Should be Course(333,\"winter\",2020):    " + b);
	
    }
    
}
