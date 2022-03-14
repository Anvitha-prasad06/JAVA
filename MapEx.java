import java.util.*;
public class MapEx {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("one","Mon");
		map.put("second","Tue");
		map.put("third","Wed");
		map.put("third","Thur");
		Set set1 = map.keySet();
		Collection collection = map.values();
		Set set2 = map.entrySet();
		System.out.println(set1 + "\n" + collection + "\n" + set2);
		
	}

}

