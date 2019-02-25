package first;
import java.util.*;
import java.util.stream.Collectors;

class Laptops{
	 int id;
	 String model;
	 float price;

Laptops(int id, String model, float price) {
		this.id = id;
		this.model = model;
		this.price = price;
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

public class Streamprac {

	public static void main(String[] args) {

		List<Laptops> list=new ArrayList<>();
		list.add(new Laptops(1,"dell",25000f));
		list.add(new Laptops(2,"dell",61000f));
		list.add(new Laptops(3,"dell",93000f));
		list.add(new Laptops(4,"dell",58000f));
		list.add(new Laptops(5,"dell",29650f));

		List<Float> pricelist=list.stream().filter(p->p.price<30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(pricelist+"\n");
		
		Map<Integer,String> lis2=list.stream().filter(p->p.price>5000).collect(Collectors.toMap(p->p.id,p->p.model));
		System.out.println(lis2+"\n");
		
		Set<Float> list3=list.stream().filter(p->p.price>=3000).map(p->p.price).collect(Collectors.toSet());
		System.out.println(list3+"\n");
		
		list.stream().filter(p->p.price>3000).forEach(Laptops->System.out.println(Laptops.id+" "+Laptops.model+" "+Laptops.price));
	
	
	}

}
