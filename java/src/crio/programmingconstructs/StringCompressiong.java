package crio.programmingconstructs;

public class StringCompressiong {
    public static void main(String[] args) {
        String s  = "1111";
        int c=1;
        if(s.length()==1){
            System.out.println(s);
            return;
        }
        if(s.length()==2){
            String a = s.charAt(0)+"";
            String b = s.charAt(1)+"";
            if(a.equalsIgnoreCase(b)){
                System.out.println(s);
                return;
            }
        }
        String str = s.charAt(0)+"";

        for(int i = 1; i< s.length();i++){
            char cur = s.charAt(i);
            char pre = s.charAt(i-1);

            if(cur==pre){
                c++;
            }
            else{
                if(c>=1){
                    str+=c;
                    c=1;
                }
                str+=cur;
            }
        }
        str+=c;
        System.out.println(str);

        /*
        * */
    }
}
