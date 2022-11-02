import java.util.Scanner;  
 class perfectnum 
{  
public static void main(String args[])    
{  
try{
long n, sum=0;  
Scanner sc=new Scanner(System.in);         
System.out.print("Enter the number: ");  
n=sc.nextLong();

int i=1;  
  
while(i <= n/2)  
{  
if(n % i == 0)  
{  
  
sum = sum + i;  
}  
i++;  
}  
if(sum==n)  
{  
System.out.println(n+" is a perfect number.");  
}   
else if(n<=0)
{
System.out.println("INVALID DATA");
}
else
System.out.println(n+" is not a perfect number.");   
} 
catch(Exception e){
            System.out.println("INVALID DATA");
}}}