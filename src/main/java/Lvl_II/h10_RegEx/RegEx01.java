package Lvl_II.h10_RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx01 {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48,"
                + "email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789:"
                + "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18,"
                + "email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321:"
                + "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21,"
                + "email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        RegEx("email:\\s*(\\w+@\\w+\\.\\w+)",s);

    }

    public static void RegEx(String pattern, String s) {
        Pattern patM = Pattern.compile(pattern);
        Matcher matM = patM.matcher(s);
        System.out.println("____________________________________________");
        while (matM.find()) System.out.println("Position: "+matM.start()+" = \""+matM.group()+"\"");

    }
}
