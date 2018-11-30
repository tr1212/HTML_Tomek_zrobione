
public class Main2 {

	public static void main(String[] args) {
		int nr1 = 7;
		int nr2 = 2;
		int nr3 = 11;
		int grade;
		if (nr1 > nr2 && nr2 > nr3) {
			grade = 7;
		} else if (nr1 < nr2 && nr2 > nr3) {
			grade = 2;
		} else {
			grade = 11;
		}
		System.out.print("Największa z liczb 7,2,11 to " + grade);
	}

}
