import java.util.ArrayList;

public class Sky {
    private ArrayList<AstroThing> items;

    public Sky() {
	items = new ArrayList<AstroThing>();
    }

    public void add(AstroThing newone) {
	items.add(newone);
    }

    @Override
    public String toString() {
	String result = "";
	for (AstroThing a : items) {
	    result += a + "\n";
	}
	return result;
    }

    public static void main(String[] args) {
	Sky sky = new Sky();

	sky.add(new Galaxy("Andromeda",2500000,100000));
	sky.add(new Star("Vega",26,1215));
	sky.add(new Star("Sirius",8.6,-700));
	sky.add(new Star("Altair",17,1640));
	sky.add(new Galaxy("Milky Way",0,100000));

	System.out.println(sky);

	AstroThing a = sky.items.get(2);
	a.setDistance(a.getDistance()*2);

	System.out.println(sky);

    }
}
