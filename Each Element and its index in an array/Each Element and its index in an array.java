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
	    System.out.println("Array Elements [ "+n+" ]");
	    for(int i =0;i<n;i++)
	    {
	        System.out.println(arr[i] +" at Index: "+i);
	    }
	}
}

/* Output:

Enter the no of Array Elements:
8
Enter the Array Elements: 
96
87
36
22
10
59
35
54

Array Elements [ 8 ]
96 at Index: 0
87 at Index: 1
36 at Index: 2
22 at Index: 3
10 at Index: 4
59 at Index: 5
35 at Index: 6
54 at Index: 7

=== Code Execution Successful ===

*/
