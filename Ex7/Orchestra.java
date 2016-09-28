public class Orchestra extends MusicGroup {

    public Orchestra(String name, String person, String musictype) {
	super(name,person,musictype);
    }

    @Override
    public boolean equals(Object other) {
	if (this == other)
	    return true;
	if (! (other instanceof Orchestra))
	    return false;
	Orchestra otherOrch = (Orchestra) other;
	return this.name.equals(otherOrch.name);
    }
    @Override
    public String toString() {
	return "Orchestra(" + getName() + "," + getPerson() + "," + getMusictype() + ")";
    }

    public static void main(String[] args) {

	Orchestra mg = new Orchestra("Great Big Sea","Alan Doyle","folk");
	System.out.println("Should be Orchestra(Great Big Sea,Alan Doyle,folk):   " + mg);

	Orchestra mg2 = new Orchestra("Great Big Sea","Me","humming");
	System.out.println("test equals. Should be true.:    " + mg.equals(mg2));

	mg2.setName("GreatBigSea");
	System.out.println("test equals. Should be false.:    " + mg.equals(mg2));
    }


}
