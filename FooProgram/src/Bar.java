public class Bar extends Foo {

	protected int m;
	protected int trip;
	
	public Bar (int m) {
		//this calls the constructor of Foo
		super(0,0,0);
		this.trip = m;
	}
	
	public Bar() {
		//This calls the default constructor
		this(0);
	}
	
	//This will override method2 from Foo
    public void method2() {
    	//Note:  x is not visible in Bar, but y and z are
    	//this.x = 0;
    	this.y = 1;
    	this.z = 1;
    	//x is there just not accessible
    	this.setx(15);
        System.out.println("bar 2");
    }
    
    //Additional methods can be defined beyond the interface
    public void method3(){
        System.out.println("bar 3");    	
    }
}

