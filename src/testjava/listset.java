package testjava;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class listset {
public static void main(String[] args) {
	List lsfList = new ArrayList();
	for(int i=0;i<800;i++){
		
		lsfList.add("123");
	}
//	lsfList.add("123");
//	lsfList.add("123");
//	lsfList.add("123");
//	lsfList.add("123");
//	lsfList.add("123");
	System.out.println(lsfList.size());
	Set<String> set = new HashSet(lsfList);
	System.out.println(lsfList.size());
	System.out.println(set.size());
    lsfList = new ArrayList(set);
    System.out.println(lsfList.size());
    System.out.println(set.size());
}
}
