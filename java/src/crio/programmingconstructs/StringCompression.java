package crio.programmingconstructs;

import java.util.Scanner;

public class StringCompression {

    static String str = "baacddfeew";

    public static void main(String[] args) {
        System.out.println(main(str));
    }

    public static String main(String str) {


        StringBuilder sbAnswer = new StringBuilder();
        if (str != null) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (!Character.isUpperCase(str.charAt(i)) && !Character.isDigit(str.charAt(i))) {
                    if (i == str.length() - 1) {
                        count = count + 1;
                        sbAnswer = sbAnswer.append(str.charAt(i));
                        sbAnswer = sbAnswer.append(count);
                        break;
                    }
                    if (str.charAt(i) == str.charAt(i + 1)) {
                        count = count + 1;


                    } else {
                        count = count + 1;
                        sbAnswer = sbAnswer.append(str.charAt(i));
                        sbAnswer = sbAnswer.append(count);
                        count = 0;

                    }
                } else sbAnswer = sbAnswer.append(str.charAt(i));
            }
        }
        return sbAnswer.toString();

    }
}