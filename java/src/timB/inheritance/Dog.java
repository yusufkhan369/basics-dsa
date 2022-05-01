package timB.inheritance;

public class Dog extends Animal{

        private int eyes;
        private int legs;
        private int tail;
        private int teeth;
        private String coat;

        @Override
        public void eat() {
                System.out.println("Dog.eat() called");
                chew();
        }

        public void walk(){
                System.out.println("Dog.chew() called");
                move(5);
        }

        public void run(){
                System.out.println("Dog.run() called");
                move(10);
        }

        public void chew(){
                System.out.println("Dog.chew() called");
        }

        public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }
}