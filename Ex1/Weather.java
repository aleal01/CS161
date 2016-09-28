import java.util.ArrayList;

public class Weather {

    private ArrayList<Storm> storms;

    public Weather() {
	storms = new ArrayList<Storm>();
    }

    public void addStorm(Storm storm) {
	storms.add(storm);
    }

    public String toString() {
	String str = "";
	for (Storm s : storms) 
	    str += s + "\n";
	return str;
    }

    public static void main(String[] args) {
	Weather weather = new Weather();

	weather.addStorm(new Hurricane("Sandy",5,false));
	weather.addStorm(new Tornado("Missouri",3));
	weather.addStorm(new Hurricane("Wow",10,true));
	weather.addStorm(new Tornado("Oklahoma",4));
	weather.addStorm(new Hurricane("Bob",3,false));

	System.out.println(weather);

	Storm storm = weather.storms.get(0);
	storm.setIntensity(storm.getIntensity() + 1);

	System.out.println(weather);

	System.out.println("Storms with intensity greater than 4:");
	for (Storm s : weather.storms) {
	    if (s.getIntensity() > 4)
		System.out.println(s);
	}

    }
}
