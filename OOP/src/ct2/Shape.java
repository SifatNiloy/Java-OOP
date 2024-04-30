package ct2;

public class Shape {
	private double r;
	
	public Shape(double r) {
		this.r=r;
		
	}
	
	public double get_r() {
		return r;
	}
	public void draw() {
		System.out.println("This is a shape");
	}
	public double calculateArea() {
		double radius= get_r();
		double result= 3.1416*radius*radius;
		return result;
	}
}
