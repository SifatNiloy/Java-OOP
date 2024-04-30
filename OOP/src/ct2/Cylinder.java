package ct2;

public class Cylinder extends Shape {
	private double height;
	public Cylinder(double r, double height) {
		super(r);
		this.height= height;
	}
	public void shape(double h) {
		this.height= height;
	}
	
	@Override
	public void draw(){
		System.out.println("This is a cylinder");
	}
	
	@Override
	public double calculateArea(){
		double radius= get_r();
		double result= 2*3.1416*radius*height + 2*3.1416*radius*radius ;
		return result;
	}
	
}
