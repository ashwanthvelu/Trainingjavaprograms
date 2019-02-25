package first;


public class Pass1 {
	float id;
	String name;	
	
Pass1(float i,String n){
	id=i;
	name=n;
}
void display(){
		System.out.println(id+" "+name);
	}
public static void main(String args[]){
	Pass1 p1=new Pass1(11.1f,"ashwanth");
	Pass1 p2=new Pass1( 0.01f,"ashwan");
	p1.display();
    p2.display();
}
}
