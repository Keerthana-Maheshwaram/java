import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        Outlander o = new Outlander(36);
        o.accelerate(30);
        
    }

}

class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;


    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;

    }

    public void steer(int direction) {
        currentDirection += direction;
        System.out.println(" vehicle.steer() the current direction is " + this.currentDirection + "degrees");

    }

    public void move(int direction, int velocity) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("vehicle.move() moving at speed" + currentVelocity + "in direction" + currentDirection);

    }

    public String getname() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void stop() {
        this.currentVelocity = 0;
    }

}

class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

   

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;

    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.setCurrentGear(): changed to " + this.currentGear + " gear");

    }

    public void changeVelocity(int speed, int direction) {
        super.move(speed, direction);
        System.out.println("speed is " + speed + "in the direction" + direction);
    }

}

class Outlander extends Car {
    private int roadServieceMonths;

    public Outlander(int roadServieceMonths) {
        super("outlander","4wd",4,4,4,false);
        this.roadServieceMonths=roadServieceMonths;
    }

    public void accelerate(int rate){
        int newVelocity=getCurrentVelocity() + rate;
        if(newVelocity==0){
            stop();
        }
        else if(newVelocity>0 && newVelocity<=10){
            changeGear(1);
        }
        else if(newVelocity>10 && newVelocity<=20){
            changeGear(2);
        }
        else if(newVelocity>20 && newVelocity<=30 ){
            changeGear(3);
        }
        else{
            changeGear(4);
        }

        if(newVelocity>0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    
    }

}
