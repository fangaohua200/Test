package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) {
		Date date = new Date();          
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
		String dateStr = df.format(date);  
		System.out.println(dateStr);  
	}

}
