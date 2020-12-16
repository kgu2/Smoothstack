
public class SumValues {

	public static void main(String[] args) {
		int sum = 0;
		try {
			for(int i = 0; i < args.length; i++) {
				sum += Integer.valueOf(args[i]);
			}
			System.out.println(sum);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
