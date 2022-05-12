package timB.AutoBox;

import java.util.ArrayList;
class Intclass{
    private int myValue;

    public Intclass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

        ArrayList<Intclass> intclassArrayList = new ArrayList<>();
        intclassArrayList.add(new Intclass(123));
    }
}
