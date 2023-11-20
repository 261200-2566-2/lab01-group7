import  java.util.Scanner;
import java.util.Arrays;
public class lab1 {
    public  static void main(String[] args){
        print(add(new Scanner(System.in)));
    }

    public static int[] add(Scanner s){
        System.out.println("Enter size:");
        int size = Integer.parseInt(s.nextLine());
        int[] arr = new int[size];
        System.out.println("Enter " + size + " number:");
        Arrays.setAll(arr, i -> Integer.parseInt(s.nextLine()));
        Arrays.sort(arr);
        return arr;
    }

    public static void print(int[] arr){
        System.out.println("Sorted integers:");
        for(int num : arr) System.out.println(num);
    }
}
