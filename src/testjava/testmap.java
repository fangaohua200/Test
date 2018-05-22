package testjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class testmap {
public static void main(String[] args) {
//	Map<String, String> map = new HashMap<String, String>();
	Map<String, String> map = new LinkedHashMap<String, String>();
	map.put("a", "hell");
	map.put("2", "hello");
	map.put("aaa", "hel");
	map.put("4", "hello");
	map.put("5", "hello");
	map.put("6", "hello");
	map.put("7", "hello");
	map.put("8", "hello");
	map.put("100", "hello");
	map.put("9", "hello");
	Set<String> keySet = map.keySet();
	
	for (String key : keySet) {
	    System.out.println("key= " + key + " and value= " + map.get(key));
	}
	
	System.out.println("ddddddddddddddddddddddddd");
    for (Map.Entry<String, String> entry : map.entrySet()) {
    	System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
    	
    	
    }
}
	
}
