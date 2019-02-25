package first;

public class ExceptHand {

	public static void main(String[] args) {
		try{
			try{
				System.out.println("process starts...");
				int a=39;
				if(a/0==0){}
			}	catch(ArithmeticException e){
				System.out.println(e);
			}
			try{
				int b[]=new int [5];
				b[8]=4;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);}
			System.out.println("flow continues");
		}catch(Exception e){
			System.out.println("running the rest");
		}
		System.out.println("normal flow");
	}
}



