
public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		b=a++;
		System.out.println(b);
		b=++a;
		System.out.println(++a);
	}
/*
pierwsza linia "System.out..." zwiększa a z 1 do 2 i zwraca a
druga linia wyświetla a i zwiększa z 2 do 3
trzecia linia zwraca a mającą aktualną wartość 3
czwarta linia nadaje zmiennej b wartość 4 (a powiększone o 1)
kolejna linia wyświetla / zwraca b równe 4
ostatnia linia powiększa a do 5 i wyświetla a
/**

}
