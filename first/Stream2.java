package first;
import java.util.*;
import java.util.stream.Collectors;

class Stream {
	int id;
	String model;
	float price;
	
Stream(int id,String model,float price) {
	 this.id=id;
	 this.model=model;
	 this.price=price;
	}
	
	public int getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public float getPrice() {
		return price;
	}
}
class Stream2{
	public static void main(String[] args) {
		List<Stream> list=new ArrayList<>();
		list.add(new Stream(1,"dell",10000f));
		list.add(new Stream(2,"acer",20000f));
		list.add(new Stream(3,"asus",30000f));
		list.add(new Stream(4,"msi",40000f));
		list.add(new Stream(5,"sony",290000f));
		
	Map<Integer,String> map=list.stream().collect(Collectors.toMap(p->p.id,p->p.model));
	System.out.println(map);
	}
}