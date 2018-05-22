package testjava;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="1";
		String str2="2";
		System.out.println(StringUtils.equals(str1, str2));
		
		List s=new ArrayList();
		s.add(str1);
		s.add(str2);
		System.out.println(s.get(2));
	}

}
