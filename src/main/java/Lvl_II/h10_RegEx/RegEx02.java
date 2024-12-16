package Lvl_II.h10_RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx02 {
    public static void main(String[] args) {
        String s1 = "ABCD ABCE ABCFABCGABCH";
        System.out.println(s1);

        Pattern pattern1 = Pattern.compile("ABC");

        Matcher matcher1 = pattern1.matcher(s1);

        while (matcher1.find()) {
            System.out.println("Position: "+matcher1.start()+"  "+matcher1.group());
        }
    }
}