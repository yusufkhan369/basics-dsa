package crio.practice.string;

public class One {
    public static void main(String[] args) {
        String fName = "Yusuf";
        String lName = "Khan";
        String fullName = fName+" "+lName;
        System.out.println(fullName);
        //Length of the string
        System.out.println(fullName.length());
        //charAt
        for (int i =0; i<fullName.length();i++){
            System.out.print(fullName.charAt(i));
        }

    }
}
