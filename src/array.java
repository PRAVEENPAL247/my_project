import java.util.Scanner;
import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of first array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the first array");
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("first array"+Arrays.toString(a));

        System.out.println("enter the size of second array");
        int m = sc.nextInt();


        int b[] = new int[m];
        System.out.println("enter the second array");

        for(int i=0;i<m;i++) {
            b[i] = sc.nextInt();
        }

        int c[] = new int[n];
        for (int i=0;i<n;i++) {
            c[i] = a[i]+b[i];

        }
        System.out.println("new array is"+Arrays.toString(c));




    }

}
