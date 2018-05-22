package testjava;

import java.util.ArrayList;
import java.util.List;

public class TestList1 {
public static void main(String[] args) {
	List<String> ss=new ArrayList<String>();
	

//	ss.add("ab");
	ss.add("cd");
	
	System.out.println(trimListToString(ss).replaceAll(",",";"));
	System.out.println(123);
}
private static String trimListToString(List<String> list){
	if(list==null){
		return "";
	}else{
		String toString=list.toString();
		return toString.substring(1, toString.length()-1);
	}
}
}
