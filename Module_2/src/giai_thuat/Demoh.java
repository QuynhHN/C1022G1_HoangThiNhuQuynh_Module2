package giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class Demoh {
    static void DemKyTu(String str)
    {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for(int j=i+1; j< str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    stringList.add(String.valueOf(str.charAt(i)));
                }
            }
        }
        System.out.println("các ký tự xuất hiện hơn 1 lần là " + stringList);
    }
    public static void main(String[] args)
    {
        String str = "abcdefdef";
        System.out.println("Chuỗi là: "+ str);
        DemKyTu(str);
    }
}
