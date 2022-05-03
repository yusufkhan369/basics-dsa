package timB.composition.c2;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("N");
        Wall wall2 = new Wall("S");
        Wall wall3 = new Wall("W");
        Wall wall4 = new Wall("E");

        Ceiling c = new Ceiling(12,55);

        Bed b = new Bed("M", 4 ,3, 2,1 );
        Lamp l = new Lamp("S",true,123);
        BedRoon br = new BedRoon("Be",wall1,wall2,wall3,wall4,c,b,l);
        br.makeBed();
//        br.ge
    }
}
