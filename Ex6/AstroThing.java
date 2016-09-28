public class AstroThing {

    protected String name;
    protected double distance;

    public AstroThing(String name, double distance) {
	setName(name);
	setDistance(distance);
    }

    public String getName() {
	return name;
    }

    public void setName(String s) {
	name = s;
    }

    public double getDistance() {
	return distance;
    }

    public void setDistance(double d) {
	distance = d;
    }

    @Override
    public boolean equals(Object other) {
	if (this == other)
	    return true;
	if (! (other instanceof AstroThing))
	    return false;
	AstroThing otherAstroThing = (AstroThing) other;
	return this.name.equals(otherAstroThing.name);
    }

    @Override
    public String toString() {
	return "AstroThing(" + getName() + "," + getDistance() + ")";
    }

    public static void main(String[] args) {

	AstroThing a = new AstroThing("Me", 1122);
	System.out.println("Should be AstroThing(Me,1122):   " + a);
	a.setName("You");
	a.setDistance(42);
	System.out.println("Testing setName and setDistance. Should be AstroThing(You,42):   " + a);
	AstroThing b = new AstroThing("Me", 1111);
	System.out.println("equals test. Should be true.    " + a.equals(b));
	b.setName("Nope");
	System.out.println("equals test. Should be false.    " + a.equals(b));
	

    }
}
				
	    
