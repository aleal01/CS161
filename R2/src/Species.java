public class Species {	

    // Put the instance variable here.
	String name;
   int population;
   int multiplier;
	
    // ....

	public Species(String strings, int i, int j) {
		this.name = strings;
		if (i < 1){
			this.population = 1;
		}
		else if (i > 1500){
			this.population = 1500;
		}
		else 
			this.population = i;

		if (j < 1){
			this.multiplier = 1;
		}
		else if (j > 20){
			this.multiplier = 20;
		}
		else 
			this.multiplier = j;
		
		// TODO Auto-generated constructor stub
	}
    // Create a Species constructor that takes in a String for its name, an int for
    // its population, and an int for its growth rate per year as a percent.
	
    // ....
    
    // mergeSpecies adds the populations of the two species, changes the name
    // of the species to the concatenation of the two names, and the growth
    // rate to the maximum of the two growth rates.



	public void mergeSpecies(Species other) {
		this.name += other.name;
		population = this.population + other.population;
		if (this.multiplier < other.multiplier)
			multiplier = other.multiplier;
		
    }

    public String toString(){
        // ....
        return "Name of Species: " + name + "\nPopulation: " + population + "\nGrowth Rate " + multiplier + "%";
    }

    // Increases the population according to the growth rate of the species, i.e.
    // updates the population instance variable by adding to it the growth rate/100 times the current population.

    public void grow() {
        // ....
        this.population = (int) (population + (population * (multiplier / 100.0)));
        
    }

    // Returns the population of the species in x years according to its growth rate.
    int newpop;
    public int populationInXYears(int x){
		for(int i = 0; i < x - 1; i++){
			
			newpop = (int) (population + (population * (multiplier / 100.0)));
			population = (int) (population + (population * (multiplier / 100.0)));
		}
    	return newpop;
		
    }

    public static void main(String[] args) {

        
    }
}
