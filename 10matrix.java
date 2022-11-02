import java.io.*;
import java.util.*;
class matrix{	
static int MAX = 100;
static void printMatrix(int M[][], int rowSize,
						int colSize)
{
	for(int i = 0; i < rowSize; i++)
	{
		for(int j = 0; j < colSize; j++)
			System.out.print(M[i][j] + " ");

		System.out.println();
	}
}
static void multiplyMatrix(int row1, int col1,
						int A[][], int row2,
						int col2, int B[][])
{
	int i, j, k;
	int C[][] = new int[MAX][MAX];
	if (row2 != col1)
	{
		System.out.println("Not Possible");
		return;
	}
	for(i = 0; i < row1; i++)
	{
		for(j = 0; j < col2; j++)
		{
			C[i][j] = 0;
			for(k = 0; k < row2; k++)
				C[i][j] += A[i][k] * B[k][j];
		}
	}
	System.out.println();
	System.out.println("Resultant Matrix: ");
	printMatrix(C, row1, col2);
}

public static void main(String[] args)
{
	Scanner read = new Scanner(System.in);
	int row1, col1, row2, col2, i, j;
	int A[][] = new int[MAX][MAX];
	int B[][] = new int[MAX][MAX];

		System.out.print("Enter the number of " +
					"rows of First Matrix: ");
	row1 = read.nextInt();
	System.out.println(row1);
	System.out.print("Enter the number of " +
					"columns of First Matrix: ");
	col1 = read.nextInt();
	System.out.println(col1);
	System.out.println("Enter the elements " +
					"of First Matrix: ");
	for(i = 0; i < row1; i++)
	{
		for(j = 0; j < col1; j++)
		{
			System.out.print("A[" + i + "][" +
									j + "]: ");
			A[i][j] = read.nextInt();
			System.out.println(A[i][j]);
		}
	}
	System.out.print("Enter the number of " +
					"rows of Second Matrix: ");
	row2 = read.nextInt();
	System.out.println(row2);
	System.out.print("Enter the number of " +
					"columns of Second Matrix: ");
	col2 = read.nextInt();
	System.out.println(col2);
	System.out.println("Enter the elements " +
					"of First Matrix: ");
	for(i = 0; i < row2; i++)
	{
		for(j = 0; j < col2; j++)
		{
			System.out.print("A[" + i + "][" +
									j + "]: ");
			B[i][j] = read.nextInt();
			System.out.println(B[i][j]);
		}
	}
	System.out.println();
	System.out.println("First Matrix: ");
	printMatrix(A, row1, col1);
	
	System.out.println();
	System.out.println("Second Matrix: ");
	printMatrix(B, row2, col2);

	
	multiplyMatrix(row1, col1, A, row2, col2, B);
}
}
