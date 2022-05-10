package timB.polymorphism.c1;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine=true;
    }

    public String startEngine(){
        return "Start";
    }

    public String accelerate(){
        return "Accelerate";
    }

    public String brake(){
        return "Brake";
    }
}

class Mi extends Car{

    public Mi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mist" + super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

public class Main {
    public static void main(String[] args) {
        Mi m = new Mi(4,"name");
        System.out.println(m.startEngine());
    }
}
