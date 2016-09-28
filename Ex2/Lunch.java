public class Lunch extends Recipe {

    protected String state;

    public Lunch(String name, String source, boolean cooked) {
	super(name,source,cooked);
    }

    @Override
    public String toString() {
	String cooked = (getCooked()) ? "Cooked" : "Not-Cooked";
	return "Lunch: " + getName() + " " + getSource() + " " + cooked;
    }

    public static void main(String[] args) {
	Lunch a = new Lunch("Sandwich","Notes", true);
	System.out.println("Should be \"Lunch: Sandwich Notes Cooked\"    " + a);

	a.addIngredient("bread");
	a.addIngredient("salami");
	System.out.println("Ingredients should be bread and salami.   " + a.getIngredients());

	// Test inheritance
	Recipe s = new Lunch("Something Good", "General Recipes", true);
	System.out.println("Tried to make a Recipe using Lunch. Should be \"Lunch: Something Good General Recipes Cooked\"    " + s);

    }

}
