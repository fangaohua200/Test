package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import com.csvreader.CsvReader;

public class Updatecvs {

		  
	    /** 
	     * 首先创建读取字符数据流对象关联所要复制的文件。 
	     * 创建缓冲区对象关联流对象。 
	     * 从缓冲区中将字符创建并写入到要目的文件中。 
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
//	        //一行一行的寫。  
//	        String line = null;  
//	        int i=0;
//	        while((line = bufr.readLine()) != null){  
//	        	
//	        	if(line.contains("plus手机膜3D曲面软边x全屏覆盖")){
//	        		line.replace("plus手机膜3D曲面软边x全屏覆盖", "plus手机膜3D曲面--"+i);
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
//	    /*  一個字節一個字節的寫。 
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
	            // 创建CSV读对象
	            CsvReader csvReader = new CsvReader(isr);

	            // 读表头
	           boolean b= csvReader.readHeaders();
	           System.out.println(b);
	           System.out.println(csvReader.getHeaders());
	           csvReader.getHeaders();
	            while (csvReader.readRecord()){
	                // 读一整行
	                System.out.println(csvReader.getRawRecord());
	                // 读这行的某一列
	                System.out.println(csvReader.get("Link"));
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	

}
