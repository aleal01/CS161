import java.util.ArrayList;

public class Forest {

    private ArrayList<Plant> plants;

    public Forest() {
	plants = new ArrayList<Plant>();
    }

    public void add(Plant plant) {
	plants.add(plant);
    }

    @Override
    public String toString() {
	String str = "";
	for (Plant s : plants) 
	    str += s + "\n";
	return str;
    }

    public static void main(String[] args) {
	Forest forest = new Forest();

	forest.add(new Tree("Willow",42.3,-120.3,"Salix"));
	forest.add(new Shrub("Blueberry",32.5,-118.2,"Vaccinium",true));
	forest.add(new Tree("Oak",23.3,-90,"Quercus"));
	forest.add(new Shrub("Poison Ivy",41.9,122.5,"Toxicodendron",false));
	forest.add(new Tree("Ponderosa Pine",21.2,-95.2,"Pinus"));
	System.out.println(forest);

	Plant p = forest.plants.get(0);
	forest.add(new Tree("Ponderosa Pine",p.getLatitude()+2,p.getLongitude(),"Pinus"));
	System.out.println(forest);
    }
}
