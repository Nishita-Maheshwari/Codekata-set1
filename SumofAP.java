import java.util.*;
import java.lang.*;
import java.io.*;
class SumofAP{
	public static void main (String[] args) {
		int first,second,t;
		Scanner sc=new Scanner(System.in);
	      t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		  first=sc.nextInt();
		  second=sc.nextInt();
		  int n=sc.nextInt();
		  int number=calculateBasic(first,second,n);
		 
		  System.out.println(number);
		}
	}
	private static int calculateBasic(int first,int second,int n)
	{
	    int d=second-first;
		 int last=first+(n-1)*d; 
		 return last;
	}
}
