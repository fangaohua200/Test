package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import com.csvreader.CsvReader;

public class Updatecvs {

		  
	    /** 
	     * ���ȴ�����ȡ�ַ����������������Ҫ���Ƶ��ļ��� 
	     * ����������������������� 
	     * �ӻ������н��ַ�������д�뵽ҪĿ���ļ��С� 
	     * @throws FileNotFoundException 
	     * @throws UnsupportedEncodingException 
	     * @throws IOException  
	     * @throws InterruptedException 
	     */  
//	    public static void main(String[] args) throws IOException, InterruptedException {  
//	        FileReader fr = new FileReader("C:\\Users\\fangh1\\Desktop\\TbDian\\123.csv");  
//	        FileWriter fw = new FileWriter("C:\\Users\\fangh1\\Desktop\\TbDian\\1234675.csv"); 
//	        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\fangh1\\Desktop\\TbDian\\123.txt"), "GBK");
//	        
//	        
//	        OutputStreamWriter writerStream = new OutputStreamWriter(new FileOutputStream("C:\\Users\\fangh1\\Desktop\\TbDian\\1113331111.txt"),"GBK");
//	        BufferedReader bufr = new BufferedReader(isr);  
//	        BufferedWriter bufw = new BufferedWriter(writerStream);  
//	        //һ��һ�еČ���  
//	        String line = null;  
//	        int i=0;
//	        while((line = bufr.readLine()) != null){  
//	        	
//	        	if(line.contains("plus�ֻ�Ĥ3D�������xȫ������")){
//	        		line.replace("plus�ֻ�Ĥ3D�������xȫ������", "plus�ֻ�Ĥ3D����--"+i);
//	        		 i++;
//	        		 System.out.println(i);
//	        	}
////	        	System.out.println(line);
////	        	Thread.sleep(1000);
//	            bufw.write(line);  
//	            bufw.newLine();  
//	            bufw.flush();  
//	           
//	        }  
//	    /*  һ���ֹ�һ���ֹ��Č��� 
//	        int ch = 0; 
//	        while((ch = bufr.read())!=-1){ 
//	            bufw.write(ch); 
//	        }*/  
//	        bufr.close();  
//	        bufw.close();  
//	    }  
	
	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {

	        String filePath = "C:\\Users\\fangh1\\Desktop\\TbDian\\123.csv";
	        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\fangh1\\Desktop\\TbDian\\123.csv"), "GBK");

	        try {
	            // ����CSV������
	            CsvReader csvReader = new CsvReader(isr);

	            // ����ͷ
	           boolean b= csvReader.readHeaders();
	           System.out.println(b);
	           System.out.println(csvReader.getHeaders());
	           csvReader.getHeaders();
	            while (csvReader.readRecord()){
	                // ��һ����
	                System.out.println(csvReader.getRawRecord());
	                // �����е�ĳһ��
	                System.out.println(csvReader.get("Link"));
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	

}
