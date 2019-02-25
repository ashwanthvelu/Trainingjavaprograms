package first;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamList {
	public static void main(String[] args){
		List<String> arrayList=new ArrayList<>();
		arrayList.add("abcd");
		arrayList.add("123435");
		arrayList.add("cbe");
		arrayList.add("annur");
		List<String> name=arrayList.stream().filter(t->t.equals("123435")).collect(Collectors.toList());
		System.out.println(name);
	}
}
