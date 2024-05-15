import java.util.Scanner;

class Box {
    double calculateVolume(double l){
        double volume = l;
        System.out.println("Sigle Volume Called; "+ volume);
        return volume;
    }
    double calculateVolume(double l, double h){
        double volume = l*h;
        System.out.println("Double Volume Called; "+ volume);
        return volume;
    }
    double calculateVolume(double l, double h, double w){
        double volume = l*h*w;
        System.out.println("Triple Volume Called; "+ volume);
        return volume;
    }
}

public class Main {
    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String n = sc.nextLine();

        Box myBox = new Box();
        myBox.calculateVolume(5);
        myBox.calculateVolume(5, 6);
        myBox.calculateVolume(5, 6, 10);
    }
}