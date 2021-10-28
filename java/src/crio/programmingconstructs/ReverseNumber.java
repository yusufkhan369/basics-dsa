package crio.programmingconstructs;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123;
        int rev_num;
        rev_num = 0;
            while (number != 0) {
                rev_num = number % 10 + rev_num * 10;
                number = number / 10;
            }
        System.out.println(rev_num);
    }
}
