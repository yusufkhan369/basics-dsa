package timB.oop.c1;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRoll;

    private String addi1Item;
    private double a1Price;

    private String addi2Item;
    private double a2Price;

    private String addi3Item;
    private double a3Price;

    private String addi4Item;
    private double a4Price;

    public Hamburger(String name, String meat, double price, String breadRoll) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoll = breadRoll;
    }

    public void addHamBurger1(String name, double price){
        this.addi1Item=addi1Item;
        this.a1Price=a1Price;
    }

    public void addHamBurger2(String name, double price){
        this.addi2Item=addi2Item;
        this.a2Price=a2Price;
    }

    public void addHamBurger3(String name, double price){
        this.addi3Item=addi3Item;
        this.a3Price=a3Price;
    }

    public void addHamBurger4(String name, double price){
        this.addi4Item=addi4Item;
        this.a4Price=a4Price;
    }

    public double itemizeHamburger(){
        double hambur = this.price;
        System.out.println(this.name +" hamburger on a " +this.breadRoll +"roll" );
        return hambur;
    }

}
