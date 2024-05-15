import java.util.Scanner;

public class TwoSuma_letcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == target) {
                    System.out.println("Match");
                    System.out.println(i + "," + j);
                }
            }
        }
    }
}

