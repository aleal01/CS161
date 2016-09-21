
public class Programmer extends Employee {
	
    private int linesOfCodePerDay;

	
		
	public Programmer(String name, int id, int linesOfCodePerDay){
		super(name,id);
		this.linesOfCodePerDay= linesOfCodePerDay;
	}

	public int work(){
		return (int) Math.floor(Math.random() * (((linesOfCodePerDay * 1.5) - (linesOfCodePerDay * 0.5)) + 1) + (linesOfCodePerDay * 0.5));
	}

	public static void main(String[] args) {
	 Employee test = new Programmer("Jill", 5, 10);
	 Employee a1 = new Programmer("Jack", 10, 10);
	 System.out.println(test.work());
    }
}
	

