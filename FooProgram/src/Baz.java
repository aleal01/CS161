public class Baz extends Foo {
	
	//m is visible to the subclass
	protected int m;
	
    //This will override the method from Foo
    public String toString() {
        return "baz";
    }
    
	//This will override the method from Foo
    public void method1() {
        System.out.println("baz 1");
    }


}

