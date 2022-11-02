import java.util.*;
class evencomposite
{
public static void main(String[]args)
{
int a,b,i,j,c,count=0,co=0;
Scanner sc=new Scanner(System.in);
System.out.print("enter A=");
a=sc.nextInt();
System.out.print("enter B=");
b=sc.nextInt();
if(a==b || a>b)
{
System.out.print("invalid input");
return;
}
if(a==1)
		{
		    System.out.print("1 is not a prime nor a composite");
		}
else
{
System.out.println("\n composite numbers");
for(i=a;i<=b;i++)
{
  c=0;
  for(j=1;j<=i;j++)
    		    		{
    		        		if(i%j==0)
    		        		{
    		            		c++;
    		        	}
    		    	}
    		    	if(c>2)
    		    	{
    		        	co++;
    		        //	System.out.print(i+", ");
    		    	}
               if(i%2==0)
               {
               System.out.print(i+", ");
               }
    		}
    		System.out.print("\nNo. of composite= "+co);
		}
	}
}