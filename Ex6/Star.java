public class Star extends AstroThing {

    protected int year;

    public Star(String name, double distance, int year) {
	super(name,distance);
	setYear(year);
    }

    public int getYear() {
	return year;
    }

    public void setYear(int y) {
	year = y;
    }

    @Override
    public boolean equals(Object other) {
	if (this == other)
	    return true;
	if (! (other instanceof Star))
	    return false;
	Star otherstar = (Star) other;
	return this.name.equals(otherstar.name);
    }

    @Override
    public String toString() {
	return "Star(" + getName() + "," + getDistance() + "," + getYear() + ")";
    }

    public static void main(String[] args) {
	Star s = new Star("Vega",11,1200);
	Star t = new Star("Vega",10,1111);

	System.out.println("Should be Star(Vega,11,1200):   " + s);
	System.out.println("equals test. Should be true:   " + s.equals(t));
	t.setName("Vega2");
	System.out.println("equals test. Should be false:   " + s.equals(t));
	
    }
}
