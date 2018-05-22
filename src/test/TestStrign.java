package test;

import org.apache.commons.lang.StringUtils;

public class TestStrign {
	public static void main(String[] args) {
		String svtModel_part = (String)"" == null ? "Blank"
				: "123";
		String ssss=StringUtils.isEmpty((String)null) ? "Blank":"111";
		System.out.println(ssss);
		
		String nowNumber="55555";
//		nowNumber.rep
		String oldMaxFifthChar = nowNumber.substring(0, 4);
		String oldMaxFifthChar1 = nowNumber.substring(5, nowNumber.length());
		
		System.out.println(oldMaxFifthChar);
		System.out.println(oldMaxFifthChar1);
	}
}
