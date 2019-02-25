package first;



class Statv {
static int count=1;
Statv() {
		count++;
		System.out.println(count);
	}
void display(){
	System.out.println(count);
}

	public static void main(String[] args) {
		Statv s1= new Statv();
		Statv s2= new Statv();
		Statv s3= new Statv();
		s1.display();
		s2.display();
		s3.display();
	}

}

