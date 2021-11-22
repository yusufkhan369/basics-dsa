package crio.practice.string;

public class compareTo {
    public static void main(String[] args) {
        String name = "Ysuuf";
        String n2 = "Yusuf";

        if(name.compareTo(n2)==0){
            System.out.println("Equal");
        }else{
            System.out.println("No");
        }

        String land = "This is a good day!";
        String str  = land.substring(land.length()-4,land.length());
        System.out.println(str);
    }

}
