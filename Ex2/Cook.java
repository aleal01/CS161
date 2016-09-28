import java.util.ArrayList;

public class Cook {

    private ArrayList<Recipe> recipes;

    public Cook() {
	recipes = new ArrayList<Recipe>();
    }

    public void addRecipe(Recipe recipe) {
	recipes.add(recipe);
    }

    @Override
    public String toString() {
	String str = "";
	for (Recipe s : recipes) 
	    str += s + "\n";
	return str;
    }

    public static void main(String[] args) {
	Cook cook = new Cook();

	Recipe a = new Lunch("Salad","Martha Stewart Cookbook",false);
	a.addIngredient("lettuce");
	a.addIngredient("tomatoes");
	cook.addRecipe(a);
	
	Recipe b = new Dinner("Bacon-Potato", "Eatin Cheap Book", true);
	b.addIngredient("potatoes");
	b.addIngredient("bacon");
	b.addIngredient("onions");
	cook.addRecipe(b);

	Recipe c = new Breakfast("Pancakes", "Moosewood Cookbook", false);
	c.addIngredient("flour");
	c.addIngredient("eggs");
	c.addIngredient("butter");
	c.addIngredient("maple syrup");
	cook.addRecipe(c);

	Recipe d = new Dinner("Pizza", "Dominoes", false);
	d.addIngredient("telephone");
	d.addIngredient("dollars");
	cook.addRecipe(d);
	
	System.out.println(cook);
	
	Recipe bp = cook.recipes.get(1);
	Recipe e = new Breakfast(bp.getName(),bp.getSource(),bp.getCooked());
	for (String ingredient : bp.getIngredients()) 
	    e.addIngredient(ingredient);
	cook.addRecipe(e);

	System.out.println(cook);

    }
}
