package timB.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("An",1,1,5,5);
        Dog d = new Dog("Y",8,20,2,4,1,20,"Silky");

        //d.eat();
        d.walk();
        d.run();
    }
}
