import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter the Array Elements [" + n + "]:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        System.out.println("Enter the Position to Insert Array Element: ");
        int pos = sc.nextInt();
        
        System.out.println("Enter the Array Element to Insert: ");
        int num = sc.nextInt();
        
        list.add(pos-1,num);
   
        System.out.println("The Array Elements [" + n + "] are:");
        for (int numelement: list) {
            System.out.print(numelement + " ");
        }
        
        sc.close();
    }
}
