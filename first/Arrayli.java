package first;

import java.util.*;

public class Arrayli {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();{
			list.add("cow");
			list.add("dog");
			list.add("pig");
			list.add("dog");
			System.out.println("traversing through list iterator:");
			ListIterator<String> list12=list.listIterator(list.size()); {
	 while(list12.hasPrevious())	{
		 String str=list12.previous();
		 System.out.println(str);
		 }
	System.out.println("Executing for loop");
	for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
				}
	System.out.println("for each loop");
	for(String st:list){
		System.out.println(st);
	}
	System.out.println("using lambda expression");
	list.forEach(a->{
		System.out.println(a);
	});
	System.out.println("using iterator");
	Iterator<String> itr=list.iterator();
	itr.forEachRemaining(a->{
		System.out.println(a);
	});	
	}
			};
		}

	}


