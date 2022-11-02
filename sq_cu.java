import java.util.*;
class sq_cu
{
	public static void main(String[] args) 
	{
		float m;
		Scanner sc=new Scanner(System.in);
		System.out.print("Given Number: ");
      if(!sc.hasNextFloat())
      {
      System.out.print("invalid");
      return;
      }
		m=sc.nextFloat();
		System.out.print("Square Number: "+(m*m)+"\n");
		System.out.print("Cube Number: "+(m*m*m));
	}
}