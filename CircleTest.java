package Circle;

public class CircleTest {
	
	public static void main(String[] args) {
		
		Circleprop next = new Circleprop(5);
		// next.radius = 5;
		next.circumference(5);
		System.out.println("the radius: " + next.radius);
		System.out.println("the circumference of non static circle: " + next.circumference(5));
		System.out.println("the area of non static circle: " + next.area(5));
		Circleprop next2 = new Circleprop(23);
		// next2.radius = 23;
		next2.circumference(23, (float) 3.14);
		System.out.println("the radius: " + next2.radius);
		System.out.println("the circumference of method overloading circle: " + next2.circumference(23, (float) 3.14));
		System.out.println("the area of method overloading circle: " + next2.area(23, (float) 3.14));
	
	
	   Rectangle rectangle1 = new Rectangle(0);
	// recangle1.height = 23;
	   System.out.println("the height: " + rectangle1.height);
	   
		System.out.println("the area of cylinder: " + rectangle1.area(0));
		
		Rectangle rectangle2 = new Rectangle(6);
		System.out.println("the height: " + rectangle2.height);
		   
		System.out.println("the area of cylinder: " + rectangle2.area(6,3));
	}
	   
	   
}
