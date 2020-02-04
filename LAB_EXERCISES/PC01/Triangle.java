import java.util.*;

public class Triangle 
{
    public static void printTriangle(int k)
    {
        int i, j, l;

        for (i = 0; i < k + 1; i++) 
        { 
            for (j = k; j > i; j--) 
            {
                System.out.print(" ");
            }

            for (l = 0; l < (2 * i - 1); l++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int k = 0;

        System.out.println("Enter height of the triangle : ");
        k = scan.nextInt();

        printTriangle(k);  
        
    }
}