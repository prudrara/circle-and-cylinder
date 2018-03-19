package Circle;

public class Rectangle extends Circleprop{
	// instance variables
	int height;
	
	
	 // default constructor
		public Rectangle(){
			
		}
		// parameterized constructor
		public Rectangle(int height) {
			super();
			this.height = height;
		}
		
		// static method	
		public int getHeight() {
			return height;	
		}
		// static method
		public static float getpi(){
			
			return pi;
		}

	// non static method
		public float area(int height) {
			float area = (float) (pi* radius *radius *height);
			return area;
		}
		// method overloading
		public float area(int height, int radius) {
			float area = (float) (pi* radius *radius *height);
			return area;
		}	
	

}
