import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int sum=0,product=1;
        int arr[] = new int[n];
        
        System.out.println("Enter the Array Elements [" + n + "]");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Sum of Array Elements:");
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.print(sum);
        System.out.println();
        System.out.println("Product of Array Elements:");
        for (int i = 0; i < n; i++) {
            product*=arr[i];
        }
        System.out.print(product);
        sc.close();
    }
}
/*
Enter the Size of Array:
4
Enter the Array Elements [4]
12
34
66
55
Sum of Array Elements:
167
Product of Array Elements:
1481040

...Program finished with exit code 0
Press ENTER to exit console.
*/
