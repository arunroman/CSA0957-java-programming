import java.util.*;
public class lcmgcd 
{
	public static void main(String[] args) 
	{
		int n1,n2,n3,gcd=1,lcm,ch,i;
		Scanner input=new Scanner(System.in);
		System.out.print("N: ");
		ch=input.nextInt();
		if(ch<0)
		{
			System.out.println("Invalid Enter only positive integers");
			return;
		}
		if(ch==2)
		{
			System.out.print("Enter number 1: ");
			n1=input.nextInt();
			System.out.print("Enter number 2: ");
			n2=input.nextInt();
    			for(i = 1; i <= n1 && i <= n2; ++i) 
			{
      			if(n1 % i == 0 && n2 % i == 0)
				{
        				gcd = i;	
				}	
    			}
			lcm = (n1 * n2) / gcd;
    			System.out.println("LCM = "+lcm);
			System.out.println("GCD = "+gcd);
		}
		else if(ch==3)
		{
			System.out.print("Enter number 1: ");
			n1=input.nextInt();
			System.out.print("Enter number 2: ");
			n2=input.nextInt();
			System.out.print("Enter number 3: ");
			n3=input.nextInt();
    			for(i = 1; i <= n1 && i <= n2; ++i) 
			{
      			if(n1%i==0 && n2%i==0 && n3%i==0)
				{
        				gcd = i;	
				}	
    			}
			lcm = (n1*n2*n3)/gcd;
      			System.out.println("LCM = "+lcm);
			System.out.println("GCD= "+gcd);
		}

	}
} 