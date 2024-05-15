class Car1{
    String name;
    int year;
     void move(){
        System.out.println("This is move Method Calling");
        return;
    }
     void sleep(){
        System.out.println("This is Sleep Method Calling");
        return;
    }
     void makeSound(){
        System.out.println("This is Make Sound Method Calling");
        return;
    }
}
public class Lab_Eva1 {
    public static void main(String[] args) {
    Car1 myCar = new Car1();
    myCar.move();
    myCar.sleep();
    myCar.makeSound();


    }
}