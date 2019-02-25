
interface Prac{
	int call(int a, int b);
}

public class Practice {

	public static void main(String[] args) {
		Prac p=(int a, int b)->(a+b);{
			System.out.println(p.call(10, 20));
		};
	Prac p2=(a,b)->(a+b);
	System.out.println(p2.call(2345, 25483787));
	}
}
