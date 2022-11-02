import java.util.*;
public class pascal
{
   public static void main(String[] args)
   {
      int n, i, j, space, count;
      Scanner input=new Scanner(System.in);
      System.out.print("Enter no. of rows: ");
	if(!input.hasNextInt())
	{
		System.out.println("Invalid Enter only integers");
		return;
	}
      n=input.nextInt();
      for(i=0; i<n; i++)
      {
         for(space=n; space>i; space--)
         {
            System.out.print(" ");
         }
         count=1;
         for(j=0; j<=i; j++)
         {
            System.out.print(count+" ");
            count = count*(i-j)/(j+1);
         }
         System.out.println();
      }
   }
}