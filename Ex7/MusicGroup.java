public class MusicGroup {

    protected String name;
    protected String person;
    protected String musictype;

    public MusicGroup(String name, String person, String musictype) {
	setName(name);
	setPerson(person);
	setMusictype(musictype);
    }

    public String getName() {
	return name;
    }
    
    public void setName(String n) {
	name = n;
    }
    
    public String getPerson() {
	return person;
    }
    
    public void setPerson(String p) {
	person = p;
    }
    
    public String getMusictype() {
	return musictype;
    }
    
    public void setMusictype(String m) {
	musictype = m;
    }
    
    @Override
    public boolean equals(Object other) {
	if (this == other)
	    return true;
	if (! (other instanceof MusicGroup))
	    return false;
	MusicGroup otherMG = (MusicGroup) other;
	return this.name.equals(otherMG.name);
    }
    
    @Override
    public String toString() {
	return "MusicGroup(" + getName() + "," + getPerson() + "," + getMusictype() + ")";
    }

    public static void main(String[] args) {

	MusicGroup mg = new MusicGroup("Great Big Sea","Alan Doyle","folk");
	System.out.println("Should be MusicGroup(Great Big Sea,Alan Doyle,folk):   " + mg);

	MusicGroup mg2 = new MusicGroup("Great Big Sea","Me","humming");
	System.out.println("test equals. Should be true.:    " + mg.equals(mg2));

	mg2.setName("GreatBigSea");
	System.out.println("test equals. Should be false.:    " + mg.equals(mg2));
    }


}
