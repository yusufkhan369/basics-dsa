package timB.inheritance.c1;

public class Vehicle {
    private String name;
    private String size;

    private int currVelocity;
    private int currDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currDirection=0;
        this.currVelocity=0;
    }

    public void steer(int direction){
        this.currDirection+=direction;
        System.out.println("Vehicle.steer(): Steering at "+currDirection+"degrees.");
    }

    public void move(int velocity, int direction){
        currDirection=direction;
        currVelocity=velocity;
        System.out.println("Vehicle.move(): Moving at "+currVelocity+"in direction "+currDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrVelocity() {
        return currVelocity;
    }

    public int getCurrDirection() {
        return currDirection;
    }

    public void stop(){
        this.currVelocity=0;
    }
}
