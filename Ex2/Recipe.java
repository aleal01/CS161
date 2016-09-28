import java.util.ArrayList;

public class Recipe {

    protected String name;
    protected String source;
    protected boolean cooked;
    protected ArrayList<String> ingredients;
    
    public Recipe(String name, String source, boolean cooked) {
	setName(name);
	setSource(source);
	setCooked(cooked);
	ingredients = new ArrayList<String>();
    }

    public String getName() {
	return name;
    }

    public void setName(String n) {
	name = n;
    }

    public String getSource() {
	return source;
    }

    public void setSource(String s) {
	source = s;
    }

    public boolean getCooked() {
	return cooked;
    }

    public void setCooked(boolean c) {
	cooked = c;
    }

    public ArrayList<String> getIngredients() {
	return ingredients;
    }

    public void addIngredient(String ingredient) {
	ingredients.add(ingredient);
    }

    @Override
    public String toString() {
	String cooked = (getCooked()) ? "Cooked" : "Not-Cooked";
	return "Recipe: " + getName() + " " + getSource() + " " + cooked;
    }

    public static void main(String[] args) {
	Recipe a = new Recipe("My Favorite", "Personal Notes", true);
	a.addIngredient("butter");
	a.addIngredient("bacon");
	System.out.println("Should be \"Recipe: My Favorite Person Notes Cooked\"      " + a);

	a.setName("My Worst");
	a.setSource("My Brother");
	a.setCooked(false);
	System.out.println("Should be \"Recipe: My Worst My Brother Not-Cooked\"      " + a);
	ArrayList<String> ings = a.getIngredients();
	System.out.println("Ingredients should be butter and bacon. " + ings);
    }
    
}
