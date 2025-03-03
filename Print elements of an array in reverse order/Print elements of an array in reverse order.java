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
	        System.out.println(arr[n-1-i] +" at Index: "+i);
	    }
	}
}

/*
Enter the no of Array Elements:
4
Enter the Array Elements: 
14
95
98
66
Array Elements [ 4 ]
66 at Index: 0
98 at Index: 1
95 at Index: 2
14 at Index: 3

=== Code Execution Successful ===
*/
