package SimplePractice;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String args[]){ 
		 try{ 
		 FileOutputStream fout=new FileOutputStream("D:\\testout.txt"); 
		 fout.write(67); 
		 fout.close(); 
		 System.out.println("success.. by Technolamror."); 
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);} 
		 } 
		}