public class Hurricane extends Storm {

    protected String name;
    protected boolean land;

    public Hurricane(String n, int i, boolean l) {
	super(i);
	setName(n);
	setLand(l);
    }

    public void setName(String s) {
	name = s;
    }

    public String getName() {
	return name;
    }

    public void setLand(boolean b) {
	land = b;
    }

    public boolean getLand() {
	return land;
    }

    @Override
    public String toString() {
	return "Hurricane: " + getName() + " " + getIntensity() + " land-" + getLand();
    }

    public static void main(String[] args) {
	Hurricane a = new Hurricane("LookOut", 5, true);
	System.out.println("Should be \"Hurricane: LookOut 5 land-true\"    " + a);
	a.setIntensity(3);
	System.out.println("Should be \"Hurricane: LookOut 3 land-true\"    " + a);
	a.setIntensity(20);
	System.out.println("Tried setIntensity(20). Should be \"Hurricane: LookOut 10 land-true\"    " + a);

	a.setLand(false);
	System.out.println("Tried setLand(false). Should be \"Hurricane: LookOut 10 land-false\"    " + a);

	a.setName("NoBiggie");
	System.out.println("Tried setName(\"NoBiggie\"). Should be \"Hurricane: NoBiggie 10 land-false\"    " + a);

	// Test inheritance
	Storm s = new Hurricane("Alice", -3, true);
	System.out.println("Tried to make a Storm using Hurricane with -3 intensity. Should be \"Hurricane: Alice 0 land-true\"    " + s);

    }

}
