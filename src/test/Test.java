package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String an="A977:1,6311:2,9206:1,A1ML:1,A2HP:1,A2V3:1,A2VX:1,A3YZ:1,A3Z2:1,A47G:1,A4C2:1,A4EL:4,A5EW:2,A5FP:1,A5FT:1,A5FV:1,A5G1:1,A5G5:2,A5G6:1,A5GZ:2,A5H0:2,A5R6:1,A5V5:1,AT89:2,AT8C:5,ATCB:2,ATDY:1,ATE1:1,ATE2:1,ATE3:1,ATE4:1,ATEA:1,ATEC:4,ATEM:1,ATFC:1,ATG2:1,ATGF:1,ATRG:1,ATZC:2";
//		an=an.replace(":1","");
//		System.out.println(an);
//		String[] ans=an.split(",");
//		List<String> a= Arrays.asList(ans);
//		Collections.sort(a);
//		System.out.println(ans.length);
//		System.out.println(a);
//		
//		
//		Double dd=1.000;
//		System.out.println(dd==1);
		
		List<String> deleteList =null;
		System.out.println(deleteList==null);
		System.out.println(null==deleteList);
		int i=deleteList==null?0:deleteList.size();
		System.out.println(i);
		System.out.println(">>>>>>deleteList.size:"+deleteList==null?0:deleteList.size());
		System.out.println(">>>>>>deleteList.size:"+deleteList==null?0:deleteList.size());
	}
}
