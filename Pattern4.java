import java.util.Scanner;

public class Pattern4 
{

	public static void main(String[] args)
	{
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of rows in pattern");
		int num= sc.nextInt();
		
		for(int i=num;i>=1; i--)
		{
			for(int k=1; k<i; k++)
			{
				System.out.print(" ");
			}
			
			for(int j=i; j<=num; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}



	}

}
