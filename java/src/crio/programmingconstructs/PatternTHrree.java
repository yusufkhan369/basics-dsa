package crio.programmingconstructs;

public class PatternTHrree {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <=6-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
row=1
column=5

row=2
column=4

row=3
column=3

row=4
column=2

row=5
column=1
*/