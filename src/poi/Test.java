package poi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
  		  if(i%2==0){
  			  System.out.println(i);
  		  }
  	  }
		
		
	 String aa="GR_ALL_RAID_CONTROLLER	2	AUNG	1	AUNH	1	5978	1	A2KH	1";
	 String bb="GR_ALL_RAID_CONTROLLER	2	AUNG	1	ABNH	1	5978	1	A3KK	1";
	 List<String> fcGroupFcList = new ArrayList<String>();
	 fcGroupFcList.add(aa);
	 fcGroupFcList.add(bb);
	 List<String> ssss= Test.getFCAndGroupFc(fcGroupFcList);
	 System.out.println(ssss);
	 
	}
	
	private static List<String> getEvenPositionValueFromList(List<String> titles) {
		List<String> selectGroups = new ArrayList<String>();
		for (int index = 0; index < titles.size(); index++) {
			if (index % 2 == 0) {
				selectGroups.add(titles.get(index));
			}
		}
		return selectGroups;
	}

	private static  List<String> getFCAndGroupFc(List<String> values) {
		Set<String> fcGroupFc = new HashSet<String>();
		for (String ruletableValue : values) {
			if (StringUtils.isNotEmpty(ruletableValue) && ruletableValue.contains("\t")) {
				String[] ss = ruletableValue.split("\t");
				List<String> list = Arrays.asList(ss);
				list=getEvenPositionValueFromList(list);
				fcGroupFc.addAll(list);
			} else {
			}

		}

		List<String> fcGroupFcList = new ArrayList<String>(fcGroupFc);
		return fcGroupFcList;
	}

}
