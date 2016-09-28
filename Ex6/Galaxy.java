public class Galaxy extends AstroThing {

    protected int diameter;

    public Galaxy(String name, double distance, int diameter) {
	super(name,distance);
	setDiameter(diameter);
    }

    public int getDiameter() {
	return diameter;
    }

    public void setDiameter(int dia) {
	diameter = dia;
    }

    @Override
    public boolean equals(Object other) {
	if (this == other)
	    return true;
	if (! (other instanceof Galaxy))
	    return false;
	Galaxy othergalaxy = (Galaxy) other;
	return this.name.equals(othergalaxy.name) && this.diameter == othergalaxy.diameter;
    }

    @Override
    public String toString() {
	return "Galaxy(" + getName() + "," + getDistance() + "," + getDiameter() + ")";
    }

    public static void main(String[] args) {
	Galaxy s = new Galaxy("Vega",11,1200);
	Galaxy t = new Galaxy("Vega",10,1111);

	System.out.println("Should be Galaxy(Vega,11,1200):    " + s);
	System.out.println("Should be Galaxy(Vega,10,1111):    " + t);
	System.out.println("equals test. Should be false:    " + s.equals(t));

	t.setDiameter(s.getDiameter());
	System.out.println("equals test. Should be true:    " + s.equals(t));

    }
}
