package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="sdfadfdfsjasdfas,s,dfsdf,sdf,gsdfg,sdfdj";
		String [] ss= StringUtils.split(a, ",");
		List<String> list=Arrays.asList(ss);
		Map map1=new HashMap();
		int i=0;
		String key="";
		for(String s:list){
			key=s+i;
			map1.put(s+i, s+i);
			i++;
		}
		Map map2=map1;
//		List<String> list1=list;
		System.out.println(ss.length);
		System.out.println("--------"+map1); 
		System.out.println("--------"+map1.size());
		map2.remove(key);
		System.out.println("--------"+map1.size());
//		System.out.println("--------"+list); 
//		System.out.println("--------"+list1); 
//		for(String sd:ss)
//		System.out.println(sd);

	}

}
