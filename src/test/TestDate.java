package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date timeDate = sdf.parse("2018-03-08");// util¿‡–Õ
	System.out.println(timeDate);
}
}
