package timB.composition.c2;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public void turnOn(){
        System.out.println("lamp -> Turning On");
    }

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
}
