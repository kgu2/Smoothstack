
public class Rectangle implements Shape {
	
	private int length, width;
	
	public Rectangle(int length, int width) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}

	@Override
	public void display() {
		System.out.println("Rectangle");
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
	}

}
