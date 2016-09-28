import java.util.ArrayList;

public class Project {

    protected String name;
    protected String date;
    protected ArrayList<String> workers;

    public Project(String name, String date) {
	setName(name);
	setDate(date);
	workers = new ArrayList<String>();
    }

    public void setName(String n) {
	name = n;
    }

    public String getName() {
	return name;
    }

    public void setDate(String d) {
	date = d;
    }

    public String getDate() {
	return date;
    }
    

    public void addToTeam(String n) {
	workers.add(n);
    }

    public void addToTeamFrom(Project p) {
	for (String person : p.workers) 
	    workers.add(person);
    }

    @Override
    public String toString() {
	return "Project: " + getName() + " " + getDate() + " " + workers;
    }

    public static void main(String[] args) {
	Project a = new Project("Code it", "10/19/15");
	a.addToTeam("Chuck");
	a.addToTeam("Bill");
	System.out.println("Should be \"Project: Code it 10/19/15 [Chuck, Bill]:  " + a);

	a.setName("Write it");
	a.setDate("1/1/1742");
	a.addToTeam("Frank");
	System.out.println("Should be \"Project: Write it 1/1/1742 [Chuck, Bill, Frank]:    " + a);
    }
}
