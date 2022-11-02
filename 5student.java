import java.util.*;
class student
{
public static void main(String[]args)
{
System.out.println("--------enter the student six marks--------");
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks in python=");
if(!sc.hasNextInt())
{
System.out.println("invalid input");
return;
}
int a=sc.nextInt();
if(a<0)
{
System.out.println("enter positive number");
return;
}
if(a<50)
{
System.out.println("fail in python");
return;
}
Scanner sc1=new Scanner(System.in);
System.out.println("enter the marks in programming=");
if(!sc1.hasNextInt())
{
System.out.println("invalid input");
return;
}
int a1=sc1.nextInt();
if(a1<0)
{
System.out.println("enter positive number");
return;
}
if(a1<50)
{
System.out.println("fail in programming");
return;
}
Scanner sc2=new Scanner(System.in);
System.out.println("enter the marks in mathematics=");
if(!sc2.hasNextInt())
{
System.out.println("invalid input");
return;
}
int a2=sc2.nextInt();
if(a2<0)
{
System.out.println("enter positive number");
return;
}
if(a2<50)
{
System.out.println("fail in mathematics");
return;
}
Scanner sc3=new Scanner(System.in);
System.out.println("enter the marks in physics=");
if(!sc3.hasNextInt())
{
System.out.println("invalid input");
return;
}
int a3=sc3.nextInt();
if(a3<0)
{
System.out.println("enter positive number");
return;
}
if(a3<50)
{
System.out.println("fail in physics");
return;
}
Scanner sc4=new Scanner(System.in);
System.out.println("enter the marks in chemistry=");
if(!sc4.hasNextInt())
{
System.out.println("invalid input");
return;
}
int a4=sc4.nextInt();
if(a4<0)
{
System.out.println("enter positive number");
return;
}
if(a4<50)
{
System.out.println("fail in chemistry");
return;
}
Scanner sc5=new Scanner(System.in);
System.out.println("enter the marks in professional ethics=");
if(!sc5.hasNextInt())
{
System.out.println("invalid input");
return;
}
int a5=sc5.nextInt();
if(a5<0)
{
System.out.println("enter positive number");
return;
}
if(a5<50)
{
System.out.println("fail in professional ethics");
return;
}
int t;
t=a+a1+a2+a3+a4+a5;
System.out.println("total="+t);
int s;
s=t/6;
System.out.println("Aggregate="+s);
if(s>=75)
{
System.out.println("Class=Distinction");
return;
}
if(s>=60 || s<75)
{
System.out.println("Class=First Division");
return;
}
if(s>=50 || s<60)
{
System.out.println("Class=Second Division");
return;
}
if(s>=40 || s<50)
{
System.out.println("Class=Third Division");
return;
}
if( s<40)
{
System.out.println("Fail");
return;
}
}
}
