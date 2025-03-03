import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n;
	    System.out.println("Enter the no of Array Elements:");
	    n = sc.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Enter the Array Elements: ");
	    for(int i =0;i<n;i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    System.out.println("Printing Alternating Array Elements: ");
	    for(int i =0;i<n;i+=2)
	    {
	        System.out.println(arr[i] +" at Index: "+i);
	    }
	}
}

/*
Enter the no of Array Elements:
6
Enter the Array Elements: 
14
95
66
32
78
99

Printing Alternating Array Elements: 
14 at Index: 0
66 at Index: 2
78 at Index: 4

=== Code Execution Successful ===
*/
