import java.util.*;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int[] arr = {1,2,3,4,5};
        try {
            c = a/b;
            arr[6] = 8;
        }
        catch (ArithmeticException e){
            System.out.println("can not " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println(c);

    }
}
