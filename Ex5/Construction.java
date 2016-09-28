public class Construction extends Project {

    protected double salary;

    public Construction(String name, String date) {
	super(name,date);
    }

    @Override
    public String toString() {
	return "Construction: " + getName() + " " + getDate() + " " + workers;
    }

    public static void main(String[] args) {
	Construction a = new Construction("Code it", "10/19/15");
	a.addToTeam("Emily");
	a.addToTeam("Sarah");
	System.out.println("Should be \"Construction: Code it 10/19/15 [Emily, Sarah]:  " + a);

	a.setName("Write it");
	a.setDate("1/1/1742");
	a.addToTeam("Frank");
	System.out.println("Should be \"Construction: Write it 1/1/1742 [Emily, Sarah, Bill, Frank]:    " + a);
    }

}
