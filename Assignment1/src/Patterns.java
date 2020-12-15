/**
 * 
 * @author kgu82
 * 
 * This program creates 4 different pattern triangles
 *
 */
public class Patterns {

	public static void main(String[] args) {
		printOne();
		printTwo();
		printThree(5);
		printFour(5);
	}

	public static void printOne() {
		System.out.println("1)");
		System.out.println("*\n**\n***\n****");
		System.out.println(".........\n");
	}

	public static void printTwo() {
		System.out.println("2)");
		System.out.println("..........");
		System.out.println("****\n***\n**\n*\n");
	}

	public static void printThree(int rows) {
		System.out.println("3)");

		int j = 0;

		for (int i = 1; i <= rows; i++) {
			j = 0;
			for (int space = 1; space <= rows - i; ++space) {
				System.out.print(" ");
			}
			while (j != 2 * i - 1) {
				if(i == 5) {
					System.out.print(".");
				}else {
					System.out.print("*");
				}
				j++;
			}
			System.out.println();
		}
		System.out.println();
	}


	public static void printFour(int rows) {
		System.out.println("4)");

		for(int i = rows; i >= 1; --i) {
			for(int n = 1; n <= rows - i; n++) {
				System.out.print(" ");
			}

			for(int j = i; j <= 2 * i - 1; j++) {
				if(i == 5) {
					System.out.print(".");
				} else {
					System.out.print("*");
				}
			}

			for(int j = 0; j < i - 1; j++) {
				if(i == 5) {
					System.out.print(".");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
