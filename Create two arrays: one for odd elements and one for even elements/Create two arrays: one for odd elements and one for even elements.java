import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        
        int odd[] = new int[n];
        int even[] = new int[n];
        int arr[] = new int[n];
        int evencount = 0, oddcount = 0;
        
        System.out.println("Enter the Array Elements [" + n + "]");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array Elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[evencount++] = arr[i];
            } else {
                odd[oddcount++] = arr[i];
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < evencount; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.println("Odd numbers:");
        for (int i = 0; i < oddcount; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
/*
Enter the Size of Array:
8
Enter the Array Elements [8]
12
4
8
66
1
31
54
77
Array Elements are:
12
4
8
66
1
31
54
77
Even numbers:
12 4 8 66 54 
Odd numbers:
1 31 77 


...Program finished with exit code 0
Press ENTER to exit console.
*/
