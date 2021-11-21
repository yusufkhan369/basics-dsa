package crio.practice.arrays;

public class One {
    public static void main(String[] args) {
        //type[] arrayName = new type[size];
        int[] marks = new int[5];
        marks[0] = 23;
        marks[1] = 34;
        marks[2] = 34;
        int sum=0;
        for (int i =0; i<marks.length;i++){
            sum+=marks[i];
        }
        System.out.println(sum);

        //Defining array[2]
        int[] arr = {1,2,3,4,5,6};
        sum =0;
        for (int i = 0; i<arr.length;i++){

            sum += arr[i];
        }
        System.out.println(sum);
    }
}
