package timB.encapsulation;

public class Main {
    public static void main(String[] args) {
        Player p = new Player();
        p.name="Tim";
        p.health=20;
        p.weapon="Peace";

        int damage=10;
        p.loseHealth(damage);
        System.out.println("Remaining health = "+p.healthRemainaing());

        damage = 11;
        p.health=200;
        p.loseHealth(damage);
        System.out.println("Remaining health = "+p.healthRemainaing());
    }
}
