package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class TestDM {

	public static void main(String[] args) {
		Set<String> allnumbers=new HashSet<String>();
		Set<String> allnumbers1=new HashSet<String>();
		try {
			// read file content from file
			StringBuffer sb = new StringBuffer("");

			FileReader reader = new FileReader("C:\\Users\\fangh1\\Desktop\\1.txt");
			BufferedReader br = new BufferedReader(reader);

			String str = null;

			while ((str = br.readLine()) != null) {
				sb.append(str + "/n");
				allnumbers.add(str.trim());
				System.out.println(str);
			}

			br.close();
			reader.close();
			
			
			/////////////////////////////////////
			FileReader reader1 = new FileReader("C:\\Users\\fangh1\\Desktop\\2.txt");
			BufferedReader br1 = new BufferedReader(reader1);

			String str1 = null;

			while ((str1 = br1.readLine()) != null) {
//				sb1.append(str + "/n");
				allnumbers1.add(str1.trim());
				System.out.println(str1);
			}

			br1.close();
			reader1.close();
			

			// write string to file
			FileWriter writer = new FileWriter("c://test2.txt");
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(sb.toString());

			bw.close();
			writer.close();
			System.out.println();
			System.out.println(allnumbers.size());
			System.out.println(allnumbers1.size());
			
//			for(String s1:allnumbers){
//				for(String s2:allnumbers1){
//					if(s1.equals(s2)){
//						System.out.println(s1);
//					}
//				}
//			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
