public class Band extends MusicGroup {

    public Band(String name, String person, String musictype) {
	super(name,person,musictype);
    }

    @Override
    public boolean equals(Object other) {
	if (this == other)
	    return true;
	if (! (other instanceof Band))
	    return false;
	Band otherBand = (Band) other;
	return this.name.equals(otherBand.name);
    }
    @Override
    public String toString() {
	return "Band(" + getName() + "," + getPerson() + "," + getMusictype() + ")";
    }

    public static void main(String[] args) {

	Band mg = new Band("Great Big Sea","Alan Doyle","folk");
	System.out.println("Should be Band(Great Big Sea,Alan Doyle,folk):   " + mg);

	Band mg2 = new Band("Great Big Sea","Me","humming");
	System.out.println("test equals. Should be true.:    " + mg.equals(mg2));

	mg2.setName("GreatBigSea");
	System.out.println("test equals. Should be false.:    " + mg.equals(mg2));
    }


}
