package SimplePractice;

import java.net.InetAddress;

public class InetDemo {

	public static void main(String[] args){ 
		try{ 
		InetAddress ip=InetAddress.getByName("https://www.google.com/"); 
		 
		System.out.println("Host Name: "+ip.getHostName()); 
		System.out.println("IP Address: "+ip.getHostAddress()); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		} 
		
		} 
		}
