import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the Array Elements [" + n + "]");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<smallest)
            smallest = arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<secondsmallest && arr[i]>smallest)
            secondsmallest = arr[i];
        }
        System.out.println("Smallest Array Element: "+smallest);
        System.out.println("Second Smallest Array Element: "+(secondsmallest == Integer.MIN_VALUE ? -1 : secondsmallest));
        sc.close();
        
    }
}
