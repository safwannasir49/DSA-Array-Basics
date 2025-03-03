import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int count=0;
        int arr[] = new int[n];
        
        System.out.println("Enter the Array Elements [" + n + "]");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Array Element: ");
        int target = sc.nextInt();
        System.out.println("Occurence of Target Array Element:");
        for (int i = 0; i < n; i++) {
            if(target == arr[i]){
                count ++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}
/*
Enter the Size of Array:
6
Enter the Array Elements [6]
12
4
6
7
4
4
Enter the Target Array Element: 
4
Occurence of Target Array Elements:
3

...Program finished with exit code 0
*/
