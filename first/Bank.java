package first;

class Test {
int getinterestof(){
	return 0;}
}
class sbi extends Test{
	int getinterestof(){
		return 8;}
	}
class axis extends Test{
	int getinterestof(){
		return 6;}
}
class kvb extends Test{
	int getinterestof(){
		return 9;}
	}

class Bank{
	public static void main(String args[]) {
		sbi s=new sbi();
		axis a= new axis();
		kvb k=new kvb();
		System.out.println("the interest of sbi"+s.getinterestof());
		System.out.println("the interest of axis"+a.getinterestof());
		System.out.println("the interest of kvb"+k.getinterestof());
		
	}


	}



