package javalab;
import java.util.*;
public class calculator {
	public static void main(String args[])
	{
	char operator;
	double n1,n2,r;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number 1:");
	n1=sc.nextDouble();
	System.out.print("Enter the number 2:");
	n2=sc.nextDouble();
	System.out.print("Choose an operator:+,-,*or/:");
	operator=sc.next().charAt(0);
	switch(operator)
	{
	case '+':
	r=n1+n2;
	System.out.print( "Result:"+r);
	break;
	case '-':
	r=n2-n1;
	System.out.print( "Result:"+r);
	break;
	case '*':
	r=n2*n1;
	System.out.print( "Result:"+r);
	break;
	case '/':
	r=n2/n1;
	System.out.print( "Result:"+r);
	break;
	}
	//sc.close();
	}
	}
