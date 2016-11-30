
public class FooBarBaz {

	public static void main(String[] args) {
		
		//We are going to store each of the objects in the superclass type
		IFoo[] a = {new Baz(), new Bar(), new Mumble(), new Foo(), new Flub()};
		
		//By declaring the variable of the interface type, it can contain anything that
		//implements the interface.  
		IFoo b0 = new Flub();
		IFoo b1 = new Foo();
		IFoo b2 = new Baz();  //inherited from Foo
		
		//Just because both classes implement an interface
		//does not make them interchangable
		//Foo c0 = new Flub();
		//Flub c1 = new Foo();
		
		//We can see what type is
		if (b0 instanceof Flub)
			System.out.println ("b0 is a Flub");
		if (b1.getClass().equals(Foo.class))
			System.out.println("b1 is a Foo");
		if (b2 instanceof Baz)
			System.out.println ("b2 is a Baz\n");
		if (IFoo.class.isAssignableFrom( b2.getClass()))
			System.out.println("IFoo is assignable from b2 - which is a Baz");
		if (!Bar.class.isAssignableFrom(b2.getClass()))
			System.out.println ("Bar is not assignable from b2 - which is a Baz");
		if (IFoo.class.isAssignableFrom( b1.getClass()))
			System.out.println("IFoo is assignable from b1 - which is a Foo");
		if (!Foo.class.isAssignableFrom(b0.getClass()))
			System.out.println("Foo is not assignable from b0 - which is a Flub");
		if (IFoo.class.isInterface())
			System.out.println ("IFoo is an interface\n");
		
		//Cannot instantiate an interface type
		//No constructor
		//IFoo c2 = new IFoo();
		
		for (int i = 0; i < a.length; i++) {
		    System.out.println(a[i]);
		    a[i].method1(); 
		    a[i].method2();
		    System.out.println();
		}

		//Let's look at instance variables
		Foo f1 = new Foo();
		//  y & z are visible
		f1.y = 10;
		f1.z = 10;
		
		//x is not visible, but the getters and setters are
		//f1.x = 10;
		f1.setx(20);
		System.out.println ("\nOutside the class, requires a getx() private x = " + f1.getx());
		
	    Foo f = new Bar();
	    // What's wrong here???
	     //f.method3();
	     ((Bar) f).method3();
	    
	    //f.m not visible unless recast
	    //f.m = 27;
	    ((Bar)f).m = 27;
	    
	    Foo f2 = new Baz();
	    //What is wrong here?
	    //.((Bar) f2).method3();
	    //Runtime error
	    
	    //Whats wrong here?
	    //Can't set sub class to super class
	    //Bar b1 = new Foo();
	    
	    Bar b = new Bar();
	    f = b;
	     //and here?
	    //b = f;
	    //We have to tell it is a Bar
	    b = (Bar) f;
	    b.method3();
	    ((Bar)f).method3();
	}
}
