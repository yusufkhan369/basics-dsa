package crio.practice.operators;

public class O12 {
    public static void main(String[] args) {
        //The total number of students in a class are 90 out of which 45 are boys.
        // If 50% of the total students secured grade 'A' out of which 20 are boys,
        // then write a program to calculate the total number of girls getting grade 'A'.
        int total = 50;
        int b = 45;
        int g = total - b;
        int totalNumberOfPeopleWhoGotGradeA = total/2;
        int totalNumberOfGirlsWhoGotGradeA = totalNumberOfPeopleWhoGotGradeA - 20;
        System.out.println(totalNumberOfGirlsWhoGotGradeA);
    }
}
