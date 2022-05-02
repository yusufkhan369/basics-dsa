package timB.composition.c1;

public class Main {

    public static void main(String[] args) {
        Dimensions dim = new Dimensions(20,20,5);
        Case theCase = new Case("220B","fs","220V",dim);

        Monitor mon = new Monitor("27 inch","Asus",20,new Resolution(20000,30000));

        Motherboard mb = new Motherboard("avas","vav",4,6,"v2.44");
        PC thePC = new PC(theCase,mon,mb);
        thePC.powerUp();
        
    }
}
