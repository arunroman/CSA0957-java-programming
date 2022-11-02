import java.util.*;
public class INTrev
{
	public static void main(String[] args) 
	{
	    int n,re,rev=0;
	    Scanner input=new Scanner(System.in);
		System.out.print("Number: ");
		if(!input.hasNextInt())
		{
		    System.out.println("Invalid Enter only Integers");
		    return;
		}
		n=input.nextInt();
		if(n==0)
		{
			System.out.print("Invalid");
			return;
		}
		while(n!=0)
		{
		    re=n%10;
		    rev=rev*10+re;
		    n=n/10;
		}
		System.out.print("Reverse Number "+rev);
	}
}