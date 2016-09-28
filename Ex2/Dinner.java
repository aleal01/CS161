public class Dinner extends Recipe {

    protected String state;

    public Dinner(String name, String source, boolean cooked) {
	super(name,source,cooked);
    }

    @Override
    public String toString() {
	String cooked = (getCooked()) ? "Cooked" : "Not-Cooked";
	return "Dinner: " + getName() + " " + getSource() + " " + cooked;
    }

    public static void main(String[] args) {
	Dinner a = new Dinner("Steak","Notes", true);
	System.out.println("Should be \"Dinner: Steak Notes Cooked\"    " + a);

	a.addIngredient("meat");
	a.addIngredient("more meat");
	System.out.println("Ingredients should be meat and more meat.   " + a.getIngredients());

	// Test inheritance
	Recipe s = new Dinner("Something Good", "General Recipes", true);
	System.out.println("Tried to make a Recipe using Dinner. Should be \"Dinner: Something Good General Recipes Cooked\"    " + s);

    }

}
