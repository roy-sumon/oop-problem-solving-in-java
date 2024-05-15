class Output{
    int i = 10;
    void myMethodOne(){
        i++;
        myMethodTwe();
        System.out.println("Hello from Method One");
    }
    void myMethodTwe(){
        i++;
        System.out.println("Hello from Method Twe");
    }
}
public class Quiz1_outputTrace {
    public static void main(String[] args) {
        Output op = new Output();
        System.out.println("Hello from Main");
        op.myMethodOne();
        System.out.println(op.i);
    }
}
