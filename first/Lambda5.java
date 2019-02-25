package first;

interface Words
{
	String say(String message);	
}

class Lambda5 {

	public static void main(String[] args) {
		Words w=(message)->{
			String st1="whaaaaaat?!         ";	
			String st2=st1.trim()+message;
			return st2;
		};
		System.out.println(w.say("nothing!"));
	}

}
