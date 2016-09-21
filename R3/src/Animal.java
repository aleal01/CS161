import java.util.ArrayList;

public class Animal {
	
	private String name;
	private int topSpeed;	
	
	
	//create the getters and setters for the instance variables
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		try{
			if(topSpeed <= 70 && topSpeed >= 0){
				this.topSpeed = topSpeed;
			}
			else
				throw new IndexOutOfBoundsException();
		}
		catch(IndexOutOfBoundsException e){
				if (topSpeed > 70){
					this.topSpeed = 70;
				}
				else
					this.topSpeed = 0;
				}
		}
	//create a constructor that takes in a String for the name and an int for the topSpeed
	//use only the setters initialize the instance variables
	public Animal(String name, int topSpeed){
		setName(name);
		setTopSpeed(topSpeed);
	}
	
	 //create an equals(Object other) method that returns True if the two Animal objects have 
	//top speeds that are within 2 mph of each other
	public boolean equals(Object other){
		if(this.topSpeed - ((Animal) other).getTopSpeed() <= 2 && 
				this.topSpeed - ((Animal) other).getTopSpeed() >= -2){
		return true;
		}
		else
		return false;
	}
	
	
	
	// Create a toString method
	// Formatting of the returned String should follow this example:
	// Name: elephant     Top Speed: 25
	public String toString(){
		return "\nName: " + name + " Speed: " + topSpeed; 	
	}
	//end
	}
	
		
	// For the setter associated with topSpeed make sure the values are between 0 and 70
        // Raise an exception if it is not within these values.
	

       
	


