import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        try {
            c = a/b;
        }catch (ArithmeticException e){
            System.out.println("can not " + e.getMessage());
        }
        System.out.println(c);

    }
}
