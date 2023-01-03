package giai_thuat;

public class Demo {
    public static void main(String[] args) {
        String s = "CodegymDaNang";
        String result = "";
        int index =0;
        for(int i =1; i<s.length();i++){
            String s1 = s.charAt(i-1) + "";
            result += s1;
            String s2 = s.charAt(i) + "";
            if(s2 == s2.toUpperCase()){
                result+= " ";
            }
            index++;
        }
        result += s.charAt(index) + "";
        System.out.println(result.toLowerCase());
    }
}
