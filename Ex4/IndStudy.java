public class IndStudy extends Course {

    protected String grade;
    
    public IndStudy(int number, String semester, int year, String grade) {
	super(number,semester,year);
	setGrade(grade);
    }

    public String getGrade() {
	return grade;
    }

    public void setGrade(String g) {
	grade = g;
    }

    @Override
    public boolean equals(Object other) {
	if (this == other)
	    return true;
	if (! (other instanceof IndStudy))
	    return false;
	IndStudy otherIndStudy = (IndStudy) other;
	return this.getNumber() == otherIndStudy.getNumber();
    }

    @Override
    public String toString() {
	return "IndStudy(" + getNumber() + ",\"" + getSemester() + "\"," + getYear() + ",\"" + getGrade() + "\")";
    }

    public static void main(String[] args) {
	IndStudy a = new IndStudy(444,"summer",1742,"S");
	System.out.println("Should be IndStudy(444,\"summer\",1742,\"S\"):   "+ a);

	IndStudy b = new IndStudy(444, "fall", 1800,"B-");
	System.out.println("equals test. Should be true.    " + a.equals(b));
	
	b.setNumber(333);
	System.out.println("setNumber and equals test. Should be false.    " + a.equals(b));
	
	b.setYear(2020);
	b.setSemester("winter");
	b.setGrade("B+");
	System.out.println("setGrade,year test. Should be IndStudy(333,\"winter\",2020,\"B+\"):    " + b);
	
    }
    
}
