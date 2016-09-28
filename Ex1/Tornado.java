public class Tornado extends Storm {

    protected String state;

    public Tornado(String s, int i) {
	super(i);
	state = s;
    }

    public void setState(String s) {
	state = s;
    }

    public String getState() {
	return state;
    }

    @Override
    public String toString() {
	return "Tornado: " + getState() + " " + getIntensity();
    }

    public static void main(String[] args) {
	Tornado a = new Tornado("Colorado", 5);
	System.out.println("Should be \"Tornado: Colorado 5\"    " + a);
	a.setIntensity(3);
	System.out.println("Should be \"Tornado: Colorado 3\"    " + a);
	a.setIntensity(20);
	System.out.println("Tried setIntensity(20). Should be \"Tornado: Colorado 10\"    " + a);

	a.setState("Nebraska");
	System.out.println("Tried setState(\"Nebraska\"). Should be \"Tornado: Nebraska 10\"    " + a);

	// Test inheritance
	Storm s = new Tornado("ChildState", -3);
	System.out.println("Tried to make a Storm using Tornado with -3 intensity. Should be \"Tornado: ChildState 0\"    " + s);

    }

}
