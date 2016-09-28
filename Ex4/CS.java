public class CS extends Course {

    protected double grade;
    
    public CS(int number, String semester, int year, double grade) {
	super(number,semester,year);
	setGrade(grade);
    }

    public double getGrade() {
	return grade;
    }

    public void setGrade(double g) {
	grade = g;
    }

    @Override
    public boolean equals(Object other) {
	if (this == other)
	    return true;
	if (! (other instanceof CS))
	    return false;
	CS otherCS = (CS) other;
	return this.getNumber() == otherCS.getNumber();
    }

    @Override
    public String toString() {
	return "CS(" + getNumber() + ",\"" + getSemester() + "\"," + getYear() + "," + getGrade() + ")";
    }

    public static void main(String[] args) {
	CS a = new CS(444,"summer",1742,89.9);
	System.out.println("Should be CS(444,\"summer\",1742,89.9):   "+ a);

	CS b = new CS(444, "fall", 1800,42.2);
	System.out.println("equals test. Should be true.    " + a.equals(b));
	
	b.setNumber(333);
	System.out.println("setNumber and equals test. Should be false.    " + a.equals(b));
	
	b.setYear(2020);
	b.setSemester("winter");
	b.setGrade(10.1);
	System.out.println("setGrade,year test. Should be CS(333,\"winter\",2020,10.1):    " + b);
	
    }
    
}
