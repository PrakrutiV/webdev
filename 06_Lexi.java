package javalab;
import java.util.*;
public class lexi {
	
	 public static void main(String[]args)
	 {
		 int n=5;
	  Scanner Sc=new Scanner(System.in);
	  String name[]=new String[5];
	  System.out.print("Enter 5 Strings:");
	  for(int i=0;i<5;i++)
	  {
		  name[i]=Sc.nextLine();
	  }
	 
	  System.out.println("Before sorting:");
	  for(int i=0;i<n;i++)
	  {
		  System.out.println(name[i]);
	  }
	  for(int i=0;i<n-1;++i)
	  {
		  for(int j=i+1;j<n;++j)
		  {
			  if(name[i].compareTo(name[j])>0)
			  {
				  String temp= name[i];
				  name[i]=name[j];
				  name[j]=temp;
			  }
		  }
	  }
	  System.out.println("After sorting:");
	  for(int i=0;i<n;i++)
	  {
		  System.out.println(name[i]);
	  }	
	 }

}
