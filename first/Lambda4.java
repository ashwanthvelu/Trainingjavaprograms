package first;
import java.util.*;
public class Lambda4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("ash");
		list.add("war machine");
		list.add("war dog");
		list.add("war lord");
		list.forEach((n)->System.out.println(n));


	}

}