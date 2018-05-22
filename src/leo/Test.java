package leo;

import java.util.Arrays;
import java.util.List;

public class Test {
	// S.

	public static void main(String[] args) {
		String ss="asdf";
		String[]sss=ss.split(",");
		List<String> ssss=Arrays.asList(sss);
		System.out.println(ssss);
		///////////////////////
		Test.testStuendt();
		
		
	}
	static void testStuendt(){
		Student s = new Student();
		s.setName("leo");
		Student a = s;
		a.setName("sdf");

		System.out.println(s.getName());
	}
}
