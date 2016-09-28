import java.util.ArrayList;

public class Work {

    ArrayList<Project> projects;

    public Work() {
	projects = new ArrayList<Project>();
    }

    public void add(Project p) {
	projects.add(p);
    }

    @Override
    public String toString() {
	String result = "";
	for (Project p : projects) {
	    result += p + "\n";
	}
	return result;
    }

    public static void main(String[] args) {
	Work work = new Work();

	Project hire = new Hire("Accounting","12/1/2015",60000.0);
	hire.addToTeam("Janet");
	hire.addToTeam("Jim");
	work.add(hire);

	Project build = new Construction("Warehouse","7/31/2016");
	build.addToTeam("Bonnie");
	build.addToTeam("Bill");
	work.add(build);

	Project design = new Design("Penthouse","6/30/2016");
	design.addToTeam("Art");
	work.add(design);

	System.out.println(work);

	design.addToTeamFrom(build);
	System.out.println(work);
    }

}
