import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t;
		Scanner sc =new Scanner(System.in);
		t=sc.nextInt();
		while(t-- >0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    if(k!=0)
		    System.out.println(n%k);
            else
            System.out.println(n);
		    
		}

	}
}

