
public class Main7 {

	public static void main(String[] args) {
		int nr1 = 7;
		int nr2 = 4;
		int result = nr1 + nr2;
		System.out.println(result);
		System.out.println(++nr1);
		System.out.println(++nr1);
		System.out.println(++nr1);
		result = nr1 + nr2;
		System.out.println(result);
// wynik wypisany w ostatniej linii jest wyższy od 11 (początkowa suma nr1 + nr2) ponieważ w liniach środkowych zwiększono zmienną a do 10

	}

}
