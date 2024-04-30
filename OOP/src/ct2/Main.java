package ct2;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner= new Scanner(System.in);
//		
//		System.out.println("enter radius: ");
//		int r= scanner.nextInt();
		
		
        Shape circle = new Circle(2);
        Shape cylinder = new Cylinder(2, 5);
        
        circle.draw();
        System.out.println("Area: " + circle.calculateArea());
        System.out.println();
        
        cylinder.draw();
        System.out.println("Area: " + cylinder.calculateArea());
		
	}

}
