package Linkedtrial;

public class ArrayEdcast {

	public static void main(String[] args) {

		//int a[]={1,2,2,3,4,4,5,5,6,7};

		
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   //ye apna Array
	       int newarr[] = new int[arr.length];  //  ye Dusra Array banay h jiski length first k equal rahegi
	       System.out.println("Duplicate elements in given array: ");  
	       for(int i = 0; i < arr.length; i++) {  
	           for(int j = i + 1; j < arr.length; j++) {  
	               if(arr[i] == arr[j]) {
	                   newarr[i] = arr[i];
	               }
	                   
	           }  
	       }
	       for(int i = 0; i < newarr.length; i++) {
	       System.out.println(newarr[i]);
	   }  
	}

}
