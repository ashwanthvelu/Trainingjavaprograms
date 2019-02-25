package first;
import java.util.*;
public class Hash1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		System.out.println("initial set of elements.."+hm);
		hm.put(100,"ashwanth");
		hm.put(101,"rossi");
		hm.put(10,"bradl");
		for(Map.Entry<Integer,String> m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.putIfAbsent(103,"lorenzo");
		System.out.println("after updating..");
		for(Map.Entry<Integer,String> m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.replace(102,"bradl","marc");
		System.out.println("after replace");
		for(Map.Entry<Integer,String> m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());	
		}
		hm.remove(101);
		System.out.println("after removing");
		for(Map.Entry<Integer,String> m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		HashMap<Integer, String> map=new HashMap<Integer, String>();{
			map.put(104,"dani");
			map.put(105, "bagnia");
			hm.putAll(map);
			System.out.println("after invoking putall method...");
			for(Map.Entry<Integer,String> m:hm.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}

	}

}
