
//30-08-2024

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0){
		     int A,B,C;
		    A=sc.nextInt();
		    B=sc.nextInt();
		    C=sc.nextInt();
		    int sum=A+B+C;
		    if(A<=B && A<=C)
		        sum -=A;
		    else if(B<=C)
		        sum -=B;
		    else 
		        sum-=C;
		   System.out.println(sum);
		}
	}
}

