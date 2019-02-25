package first;

interface Addition{
	int add(int a,int b);
}
public class Lambda3 {

	public static void main(String[] args) {
		Addition ad=(int a, int b)->(a+b);
		System.out.println(ad.add(10,25));
		
		Addition ad1=(int a, int b)->(a*b);
		System.out.println(ad1.add(3,3));
		
	}

}
