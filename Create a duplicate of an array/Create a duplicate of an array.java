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
	    int duplicate[] = new int[n];
	    System.out.println("\nArray Elements: ");
	    for(int i =0;i<n;i++)
	    {
	        duplicate[i] = arr[i];
	        System.out.println(arr[i] +" at Index: "+i);
	    }
	    System.out.println("\nDuplicate Array Elements: ");
	    for(int i =0;i<n;i++)
	    {
	        System.out.println(duplicate[i] +" at Index: "+i);
	    }
	}
}
/*
Enter the no of Array Elements:
6
Enter the Array Elements: 
45
89
65
30
55
79

Array Elements: 
45 at Index: 0
89 at Index: 1
65 at Index: 2
30 at Index: 3
55 at Index: 4
79 at Index: 5

Duplicate Array Elements: 
45 at Index: 0
89 at Index: 1
65 at Index: 2
30 at Index: 3
55 at Index: 4
79 at Index: 5

=== Code Execution Successful ===
*/
