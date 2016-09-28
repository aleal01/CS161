import java.util.ArrayList;

public class Groups {

    ArrayList<MusicGroup> groups;

    public Groups() {
	groups = new ArrayList<MusicGroup>();
    }

    public void addGroup(MusicGroup g) {
	groups.add(g);
    }

    public int numberOfGroups() {
	return groups.size();
    }

    public MusicGroup findGroup(String name) {
	MusicGroup g = new MusicGroup(name,"","");
	int i = groups.indexOf(g);
	if (i > 0)
	    return groups.get(i);
	else
	    return null;
    }

    @Override
    public String toString() {
	String s = "";
	for (MusicGroup g : groups) {
	    s += g + "\n";
	}
	return s;
    }

    //======================================================================
    public static void main(String[] args) {

	Groups groups = new Groups();

	groups.addGroup(new Band("Great Big Sea","Alan Doyle","folk"));
	groups.addGroup(new Band("Styx", "Dennis DeYoung","rock"));
	groups.addGroup(new Orchestra("New York Philharmonic","Alan Gilbert", "classical"));
	groups.addGroup(new Orchestra("Hipster Orchestra","Jingle Punks","modern"));
	groups.addGroup(new Band("Spearhead", "Michael Franti", "reggae"));

	System.out.println(groups);
	System.out.println("number of groups is " + groups.numberOfGroups());
	System.out.println(groups.findGroup("Spearhead"));
    }
}
