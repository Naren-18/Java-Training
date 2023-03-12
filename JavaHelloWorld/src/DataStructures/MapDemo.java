package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer> marks=new HashMap<>() ;
			marks.put("BOB",90);
			marks.put("MAX",99);
			marks.put("SAM",80);
		System.out.println(marks);
		System.out.println(marks.keySet());
		System.out.println(marks.values());
		for(String key:marks.keySet()) {
			System.out.println(marks.get(key));
		}
	}
}
