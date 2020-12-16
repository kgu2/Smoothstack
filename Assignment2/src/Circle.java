
public class Circle implements Shape {
	
	public static final double PI = 3.14;
	private int r;
	
	public Circle(int radius) {
		this.r = radius;
	}

	@Override
	public double calculateArea() {
		return PI * r * r;
	}

	@Override
	public void display() {
		System.out.println("Circle");
		System.out.println("Radius: " + r);
	}

}
