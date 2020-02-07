import java.util.*;

public class SawBlade
{
	public void sawBlade(int k)
	{
		int i,j;

		for(i=1; i<=k; i++)
		{
			for(j=0; j<i; j++)
			{
				System.out.print("*");
			}

			System.out.println();
		}

		k--;
		sawBlade(k);
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
        int k = 0;

        System.out.println("Enter height of the triangle : ");
        k = scan.nextInt();

        SawBlade sw = new SawBlade();

        sw.sawBlade(k);  
        
	}
}