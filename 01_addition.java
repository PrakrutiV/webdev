package javalab;
import java.util.Scanner;
class sum 
{
	 void add(int a[][],int b[][],int m,int n)
	 {
		 int i,j;
		 int res[][]=new int[m][n];
		  for(i=0; i<m; i++)
	      {
	         for(j=0; j<n; j++)
	         {
	            res[i][j]=a[i][j]+b[i][j];
	         }
	      }
		  System.out.println("\n----Addition Result----");
	      for(i=0; i<m; i++)
	      {
	         for(j=0; j<n; j++)
	         {
	            System.out.print(res[i][j]+ " ");
	         }
	         System.out.print("\n");
	      }
	   }
	 }
public class addition
{
	public static void main(String args[])
	{
		Scanner Sc =new Scanner(System.in);
		System.out.print("Enter number of rows and columns");
		int m = Sc.nextInt();
		int n = Sc.nextInt();
		int a[][]= new int[m][n];
		int b[][]= new int[m][n];
		System.out.print("Enter matrix A:");
		 for(int i=0; i<m; i++)
	      {
	         for(int j=0; j<n; j++)
	         {
	            a[i][j] = Sc.nextInt();
	         }
	      }
		 System.out.print("Enter matrix B:");
		 for(int i=0; i<m; i++)
	      {
	         for(int j=0; j<n; j++)
	         {
	            b[i][j] = Sc.nextInt();
	         }
	      }
		 sum obj= new sum();
		 obj.add(a,b,m,n);
		 
	}
}

