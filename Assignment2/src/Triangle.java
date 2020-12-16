
public class Triangle implements Shape {
	
	private int base, height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return 0.5 * (base * height);
	}

	@Override
	public void display() {
		System.out.println("Triangle");
		System.out.println("Base: " + base);
		System.out.println("Height: " + height);
		
	}

}
