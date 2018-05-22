package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sslist=new ArrayList<String>();
		sslist.add("E20000004769");
		sslist.add("E20000005768");
		sslist.add("E20000002768");
		sslist.add("E20000011768");
		sslist.add("E20000004068");
		Collections.sort(sslist);
		Collections.reverse(sslist);
		System.out.println(sslist);
		System.out.println(sslist.get(0));
	}

}
