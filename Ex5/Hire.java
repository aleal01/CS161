public class Hire extends Project {

    protected double salary;

    public Hire(String name, String date, double salary) {
	super(name,date);
	setSalary(salary);
    }

    public void setSalary(double s) {
	salary = s;
    }

    public double getSalary() {
	return salary;
    }

    @Override
    public String toString() {
	return "Hire: " + getName() + " " + getDate() + " " + getSalary() + " " + workers;
    }

    public static void main(String[] args) {
	Hire a = new Hire("Code it", "10/19/15", 20000);
	a.addToTeam("Emily");
	a.addToTeam("Sarah");
	System.out.println("Should be \"Hire: Code it 10/19/15 20000 [Emily, Sarah]:  " + a);

	a.setName("Write it");
	a.setDate("1/1/1742");
	a.setSalary(66000);
	a.addToTeam("Frank");
	System.out.println("Should be \"Hire: Write it 1/1/1742 66000 [Emily, Sarah, Bill, Frank]:    " + a);
    }

}
