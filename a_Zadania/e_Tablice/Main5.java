
public class Main5 {

	public static void main(String[] args) {
		int[] numbers = {-2, -4, -5, -7, -6, -12, -3, -8, -90, -4};
		int max = 0;
		for (int i = 0; i < 10; i++)
			if (max < numbers[i]) {
				max = numbers[i];
			}
			System.out.println("maksymalna to " + max);

	}

}
