package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class uniqNumbers {

	public static List<Integer> getuniq(List<Integer> li){
		return li.stream().distinct().toList();
		
	}
	public static Set<Integer> getdup(List<Integer> li){
		return li.stream().filter(e -> Collections.frequency(li, e)>1).collect(Collectors.toSet());
		
	}
	
	
	public static void main(String[] args) {
		int[] ar = {4,8,9,0,6,5,3,2,7,6,8,3};
ArrayList<Integer> list = new ArrayList<>();
for(int n : ar) {
	list.add(n);
}
List<Integer> uniqlist = getuniq(list);
System.out.println(uniqlist);
Set<Integer> duplist = getdup(list);
System.out.println(duplist);
		 
	}
}
