package first;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();

		System.out.println("initial list of elements.."+al);
		al.add("ashwanth");
		al.add("aquaman");
		al.add("superman");
		System.out.println("after inserting element with index"+al);
		al.add(1,"cyborg");
		System.out.println("adding elements from another arraylist"+al);
		List <String> al1=new ArrayList<>();
		al1.add("flash");
		al1.add("deadshot");
		al.addAll(al1);
		System.out.println("adding bulk elements to index.."+al);
		List<String> al2=new ArrayList <>();
		al2.add("joker");
		al2.add("harley quinn");
		al.addAll(1,al2);
		System.out.println("after invoking everything.."+al.get(1));
	}

}
