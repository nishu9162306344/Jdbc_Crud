package class_and_obj;

import java.util.HashMap;
import java.util.Set;

import javax.sound.midi.Soundbank;

public class himpl {

	//main method
	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap=new HashMap<>();	
		
		
		hmap.put("India", 678);
		hmap.put("Australia",897);
		hmap.put("Newsland", 1278);
		hmap.put("USA", 8000);

		System.out.println(hmap);
		System.out.println(hmap.size());
		
		if (hmap.containsKey("Ibbndia")) {
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}
		
		 
 		
		System.out.println("new Hashmap "+hmap);

		//remove
		hmap.remove("India");
		System.out.println(hmap);
		//iterative
		Set<String> keySet = hmap.keySet();
		
		for(String str:keySet) {
			
			System.out.println(str);
		}
	}
	
}
