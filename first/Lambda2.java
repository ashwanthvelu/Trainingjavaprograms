package first;

interface Say{
	public String say(String name);
}

public class Lambda2 {

	public static void main(String[] args) {
		Say s=name->{
			return"hello "+name;
		};
		System.out.println(s.say("ashwa"));

	}

}
