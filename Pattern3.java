import java.util.Scanner;

public class Pattern3
{

	public static void main(String[] args)
	{
        Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the number of rows in pattern");
		int num= scan.nextInt();
		
		for(int i=num;i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");
		}

	}

}
