import java.util.*;
class fibo 
{
   public static void main(String[] args)
   {
      int n, i, sum;
      System.out.println("Required packages have been imported");
      Scanner input = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.println("Enter the value of N: ");
      n = input.nextInt();
      int fibonacci[] = new int[2*n+1];
      fibonacci[0] = 0;
      fibonacci[1] = 1;
      sum = 0;
      for (i = 2; i <= 2 * n; i++) 
	{
         fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
         if (i % 2 == 0)
            sum += fibonacci[i];
      }
      System.out.printf("Even sum of fibonacci series till number %d is %d" , n, sum);
   }
}