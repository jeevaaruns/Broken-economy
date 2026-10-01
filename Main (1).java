import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        int lo = 0;
        int hi = n - 1;

        int ceil = -1;
        int floor = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (a[mid] == d) {
                // If d exists, it is both ceil and floor
                ceil = a[mid];
                floor = a[mid];
                break;
            } 
            else if (a[mid] < d) {
                floor = a[mid];   // Possible floor
                lo = mid + 1;
            } 
            else {
                ceil = a[mid];    // Possible ceil
                hi = mid - 1;
            }
        }

        System.out.println("Ceil = " + ceil);
        System.out.println("Floor = " + floor);
    }
}

