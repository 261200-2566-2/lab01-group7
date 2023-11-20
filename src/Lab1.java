import java.util.Scanner;
import java.util.Arrays;

public class Lab1 {
    public static void sorted(int[] arr) {
        Arrays.sort(arr);
    }

    public static void printed(int[] arr){
        System.out.println("Sorted integers:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter unsigned int:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        sorted(arr);
        printed(arr);
    }


}
