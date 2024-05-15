class Area{
    int a, b, c;

    //using method
    void printArea(int a){
        System.out.println("PI: " +Math.PI*a*a);
    }
    void printArea(int a, int b){
        System.out.println("Area of AB: " +a*b);
    }
    void printArea(int a, int b, int c){
        System.out.println("Area of ABC: " +a*b*c);
    }
//    using constractor
//    Area(int a, int b){
//        this.a=a;
//        this.b=b;
//        System.out.println("Area of AB: " +a*b);
//    }
//    Area(int a, int b, int c){
//        this.a=a;
//        this.b=b;
//        this.c=c;
//        System.out.println("Area of ABC: " +a*b*c);
//    }
//    Area(int a){
//        this.a=a;
//        System.out.println("Value of PI: "+Math.PI*a*a);
//    }
}
public class Area_Calculation {
    public static void main(String[] args) {
//        Area a1 = new Area(5);
//        Area a2 = new Area(5, 8);
//        Area a3 = new Area(5, 7, 10);

        Area a4 = new Area();
        a4.printArea(8);
        a4.printArea(5, 6);
        a4.printArea(5, 6, 7);
    }
}
