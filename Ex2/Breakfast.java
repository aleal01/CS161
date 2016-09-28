public class Breakfast extends Recipe {

    protected String state;

    public Breakfast(String name, String source, boolean cooked) {
	super(name,source,cooked);
    }

    @Override
    public String toString() {
	String cooked = (getCooked()) ? "Cooked" : "Not-Cooked";
	return "Breakfast: " + getName() + " " + getSource() + " " + cooked;
    }

    public static void main(String[] args) {
	Breakfast a = new Breakfast("Brekkie","Notes", true);
	System.out.println("Should be \"Breakfast: Brekkie Notes Cooked\"    " + a);

	a.addIngredient("nuts");
	System.out.println("Ingredients should be just nuts.   " + a.getIngredients());

	// Test inheritance
	Recipe s = new Breakfast("Something Good", "General Recipes", true);
	System.out.println("Tried to make a Recipe using Breakfast. Should be \"Breakfast: Something Good General Recipes Cooked\"    " + s);

    }

}
