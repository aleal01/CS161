import java.util.ArrayList;

public class Company {

    ArrayList<Project> projects;

    public Company() {
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
	Company company = new Company();

	Project hire = new Hire("Accounting","12/1/2015",60000.0);
	hire.addToTeam("Janet");
	hire.addToTeam("Jim");
	company.add(hire);

	Project build = new Construction("Warehouse","7/31/2016");
	build.addToTeam("Bonnie");
	build.addToTeam("Bill");
	company.add(build);

	Project design = new Design("Penthouse","6/30/2016");
	design.addToTeam("Art");
	company.add(design);

	System.out.println(company);

	design.addToTeamFrom(build);
	System.out.println(company);
    }

}
