package staticMethod;

public class StaticMethod {
	static int x=10;
	void display1() {
		System.out.println("I am non static method");
	}
	static void display2() {
		System.out.println(x);
		System.out.println("I am static method");
	}
	
	//restriction: we can't call non static method in static method
	//restriction: we can't access non static variable from static method
}
