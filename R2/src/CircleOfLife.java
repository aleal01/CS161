public class CircleOfLife {

    public static void main(String args[]) {


        // Put simple code here to test the Species class.  It is always a good idea to include
        // a main method in any class you define.

        Species a = new Species("Frog", 100, 10);
        System.out.println(a);

        a.grow();
        System.out.println("a.populationInXYears(10) returns " + a.populationInXYears(2));

        Species b = new Species("Rabbit", 10, 23);
        a.mergeSpecies(b);
        System.out.println("a.mergeSpecies(b) is " + a);
         
        // Create a new Species object here, passing in the appropriate arguments
        // Print out the species' growth rate
        // Use the species' toString here
		
        // Call populationInXYears here
		
        // Create a new Species object here, passing in the appropriate arguments
        // using a very large number for the population (e.g. 100000000)

        // Print out the species' population to make sure it is set to 1500

        // Call populationInXYears here, feel free to hardcode in the int to be passed to the method

        // Call mergeSpecies here. Test that mergeSpecies is doing what you expected it to
				
    }
}
