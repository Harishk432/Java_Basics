package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arraylist {

	
	
	public static void arraylistexample() {
		
		List<String> arraylist=new ArrayList<String>();
		arraylist.add("Harish");
		arraylist.add("Senthil");
		arraylist.add("Gokul");
		arraylist.add("Gokul");
		System.out.println(arraylist);
		
		System.out.println(arraylist.get(2));
		System.out.println(arraylist.indexOf("Senthil"));
		System.out.println(arraylist.lastIndexOf("Gokul"));
		
		
		
		List<String> anotherlist=new ArrayList<String>();
		anotherlist.addAll(arraylist);
		System.out.println(anotherlist);
		anotherlist.clear();
		arraylist.remove(0);
		System.out.println(arraylist);
		System.out.println(arraylist.isEmpty());
		
		
		//Iterate
		for  (String string : arraylist) {
			System.out.println("Using for each " +string);	
		}
		
		System.out.println("-----------------------------");
		for(int i=0; i<arraylist.size(); i++) {
			System.out.println("Using for loop"+arraylist.get(i));
		}
		System.out.println("-----------------------------");
		
		ListIterator<String> iterator = arraylist.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("-----------------------------");
		
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());	
		}
				
		
	}
	public static void main(String[] args) {
		arraylistexample();
		
		
		// TODO Auto-generated method stub

	}

}
