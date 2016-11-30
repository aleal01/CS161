
public class Foo implements IFoo, Comparable<Object> {	

	//Foo implements the interface IFoo
	//Below are several examples of what that means
	
	private int x;
	protected int y;
	public int z;
	
	public Foo(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Foo() {
		this(0,0,0);
	}
	
	public int getx() {
		return this.x;
	}
	
	public void setx(int xx){
		this.x = xx;
	}
	
	//The file implementing the interface have an implemention
	//of all the methods.  
	
	//Commenting out the below will illustrate.
    public void method1() {  System.out.println("foo 1");  }

    public void method2() {  System.out.println("foo 2"); }
    
    //Is it possible to comment out toString?  Why?
    //public String toString() {  return "foo";  }
    
    public int compareTo (Object o) {
    	Foo f = (Foo) o;
    	if (f.y < this.y) return -1;
    	else if (f.y == this.y)return 0;
    	else return 1;
    } 
    public boolean equals (Object o) {
    		Foo f = (Foo) o;
    		if (f.y == this.y)
    			return true;
    		else
    			return false;
    }
}
