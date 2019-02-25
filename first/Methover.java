package first;

public class Methover {
	
	static int add(int a,int b){
		return a+b;
	}
    static int add(int a, int b,int c){
    	return a+b+c;
    }
static class Overloading{
	public static void main(String[] args) {
		System.out.println(Methover.add(11,11));
		System.out.println(Methover.add(1,1,8));
	    
	}

}
}