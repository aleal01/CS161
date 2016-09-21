import java.util.ArrayList;

public class Project {
	
	private int linesOfCode;
	private int linesOfCodeWritten;
	private int linesOfCodeTested;
	private int duration;
	private ArrayList<Employee> employees = new ArrayList<Employee>();

	Project(int durationTime, int linesOfTheCode){
		this.linesOfCode = linesOfTheCode;
		this.duration = durationTime;
		
	}
	
	public void addEmployee(Employee name){
		employees.add(name);
	}
	public int doProject(){
		int days = 0;
		while(linesOfCodeWritten < linesOfCode || linesOfCodeTested < linesOfCode){
			days++;
			for(int i = 0; i < employees.size(); i++){
				if(employees.get(i) instanceof Programmer){
					linesOfCodeWritten+= employees.get(i).work();
				}
				if(employees.get(i) instanceof Tester){
					linesOfCodeTested+= employees.get(i).work();
				}
				
			}
		}
		return (days - duration) * -1;
	}
	public String toString(){
		return "\nEmployee: " + employees + " duration: " + duration + " Lines of Code Written: " + linesOfCodeWritten + " Lines of code Tested: " + linesOfCodeTested;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Project a1 = new Project(50, 10000);
		
		Employee tom = new Programmer("Tom" , 50,50);
		Employee bill = new Tester("Bill" , 50, 100);
		a1.addEmployee(bill);
		a1.addEmployee(tom);
		System.out.println(a1);
		a1.doProject();
		System.out.println(a1.doProject());
		System.out.println(tom.work());
		System.out.println(bill.work());
		a1.toString();
		System.out.println(a1.toString());
		
		
		

	}

}
