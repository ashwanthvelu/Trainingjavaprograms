package first;

interface sayable
{
	public String say(); 
}

public class Lambda1 {

	public static void main(String[] args) {
		sayable s=()->{			
			return "whaaaaat?!";
		};
		System.out.println(s.say());
	}

}
