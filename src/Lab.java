
class  Vehicle{
    String model;
    int year;
    String color;
    void moveForward(){
        System.out.println("Vehicle move Forward");
    }
}
class Car extends Vehicle{
    String engine;
    String fourWheel;
        }
class Cycle extends Car{
    String twoWheel;
}

class Lab {
    public static void main(String[] args) {

        Vehicle myV = new Vehicle();
        myV.color = "Red";

        Car myCar = new Car();
        myCar.engine = "V7";
        myCar.fourWheel = "Have four Chaka";
        myCar.moveForward();

        Cycle c = new Cycle();
        c.twoWheel = "Have two Chaka";
        c.model = "Old";
        c.moveForward();


    }
}
