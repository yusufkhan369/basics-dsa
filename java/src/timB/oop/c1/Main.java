package timB.oop.c1;

public class Main {
    public static void main(String[] args) {
        Hamburger hb = new Hamburger("Basic", "Turkey", 10.23,"Vanilla roll");
        double price = hb.itemizeHamburger();
        hb.addHamBurger1("Tomato", 4.5);

    }
}
