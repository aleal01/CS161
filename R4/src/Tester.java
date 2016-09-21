
public class Tester extends Employee{


	private int linesOfCodePerDay;


	public Tester(String Employeename, int ID, int linesOfCodePerDay) {
		super(Employeename, ID);
		this.linesOfCodePerDay= linesOfCodePerDay;
		// TODO Auto-generated constructor stub
	}

	
	public int work() {
		
		return (int) ((int) (Math.floor(Math.random() * linesOfCodePerDay * 1.25) - (linesOfCodePerDay * 0.75) + 1) + (linesOfCodePerDay * 0.75));
	}
	public static void main(String[] args) {
		 Employee test2 = new Tester("Jill", 5, 10);  
		 Employee test3 = new Tester("Bill", 5, 10); 
		 System.out.println(test2.work());
	    }
	
}
