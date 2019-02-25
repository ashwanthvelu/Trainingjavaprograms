package first;
import java.util.*;
public class Listiterator {

	public static void main(String[] args) {
	List<String> list=new ArrayList<>();{
		list.add("james");
		list.add("cameroon");
		list.add("christopher");
		list.add("nolan");
		ListIterator<String> itr=list.listIterator();
		System.out.println("froward iteration...");
		while(itr.hasNext()){
			System.out.println("index:"+itr.next());
		}
		System.out.println('\n'+"reverse iteration...");
		while(itr.hasPrevious()){
			System.out.println("index:"+itr.previous());
		}
	}

	}

}
