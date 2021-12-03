package preicsely.chap4;

public class ecount {
    public static void main(String[] args) {
        String s = "elephant";
        int count=0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='e'){
                count++;
            }
        }
        System.out.println(count);
    }
}
