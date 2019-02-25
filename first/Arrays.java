package first;
import java.util.*;


public class Arrays {
	String name;
	int id;
	int age;
Arrays(int id,String name,int age){	
this.age=age;
this.id=id;
this.name=name;
}
}

class Arrayobj{
	public static void main(String args[]){
		Arrays a1=new Arrays(1,"ashwanth",23);
		Arrays a2=new Arrays(2,"ashwanth",23);
		Arrays a3=new Arrays(3,"ashwanth",23);
		
		List<Arrays> list=new ArrayList<Arrays>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		Iterator<Arrays> itr=list.iterator();
		while(itr.hasNext()){
			Arrays a=(Arrays)itr.next();
			System.out.println(a.id+" "+a.name+" "+a.age );
		}
			
		}
	}

