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
        
        System.out.println("Enter the Position to Remove Array Element: ");
        int pos = sc.nextInt();
        
        if(pos<1 || pos>list.size()){
            System.out.println("Invalid Position");
        }else{
        list.remove(pos-1);
        }
   
        System.out.println("The Array Elements [" + n-1 + "] are:");
        for (int numelement: list) {
            System.out.print(numelement + " ");
        }
        
        sc.close();
    }
}
