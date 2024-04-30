package ct2;

public class Circle extends Shape {
	
	public Circle(double r) {
		super(r);
	}
	
	@Override
	public void draw(){
		System.out.println("This is a circle");
	}
	
	@Override
	public double calculateArea(){
		double radius= get_r();
		double result= 3.1416*radius*radius;
		return result;
		
	}
}
