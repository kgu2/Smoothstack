
public class Max {
	
	public static void main(String [] args) {
		int[][] testAryOne = {{1,2,3}, {2,3}};
		int[][] testAryTwo = {{1,2,3}};
		int[][] testAryThree = {};
		
		findMax(testAryOne);
		System.out.println("--------------------------------");
		findMax(testAryTwo);
		System.out.println("--------------------------------");
		findMax(testAryThree);
		System.out.println("--------------------------------\n\n");
		
		Triangle triangle = new Triangle(5,5);
		triangle.display();
		System.out.println(triangle.calculateArea()+"\n");
		
		Circle circle = new Circle(5);
		circle.display();
		System.out.println(circle.calculateArea()+"\n");
		
		Rectangle rect = new Rectangle(5,5);
		rect.display();
		System.out.println(rect.calculateArea()+"\n");
	}
	
	public static void findMax(int[][] ary) {
		int max = 0;
		int[] index = new int[2];
		
		for(int i = 0; i < ary.length; i++) {
			for(int j = 0; j < ary[i].length; j++) {
				if(ary[i][j] > max) {
					max = ary[i][j]; 
					index[0] = i;
					index[1] = j;
				}
			}
		}	
		System.out.println("Max Value:" + max);
		System.out.println("Index: row " + index[0] + ", col " + index[1]);
	}
}
