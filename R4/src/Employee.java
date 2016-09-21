public abstract class Employee {

    public String name;
    public int id;
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Employee(String Employeename, int ID){
		name = Employeename;
		id = ID;
	}

	public abstract int work();

    public String toString() {
	return name + " ID: " + id;
    } 

    public boolean equals(Object other) {
	if (other instanceof Employee && other != null) {
	    return (name.equals(((Employee)other).name) && id == ((Employee)other).id);
	}
	return false;
    }
    public static void main(String[] args) {
    	
    
    }
}