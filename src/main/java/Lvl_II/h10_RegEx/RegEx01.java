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
        String s1 = "chuck@gmail.com";

        //переформатирование текста, работа с форматами
        String s2 = "2938138472937439524567894736472496285375";

        Pattern pSimTEST = Pattern.compile("(\\d{3})(\\d{3})(\\d{2})(\\d{2})");
        Matcher mSimTEST = pSimTEST.matcher(s2);
//        String s3 = mSimTEST.replaceAll("$1 $2 $3 $4\n");
//        System.out.println(s3);
        while(mSimTEST.find()){
            System.out.println(mSimTEST.group(3));
        }
        //сравнение идентичность строкового текста
        boolean result = s1.matches("\\w+@\\w+\\.(ru|com)");
        String [] ss = s.split(" ");
//        for(String sE:ss) System.out.print(sE);
        CheckIP("255.38.192.99");
        CheckIP("182.262.91.05");
        CheckIP("110.48.144.15");

        //изменения текста
        System.out.print(s1+" : ");
        s1 = s1.replace("hu","HU");
        System.out.println(s1);

        System.out.print(s1+" : ");
        s1 = s1.replaceAll("\\w+@","777@");
        System.out.println(s1);
        //сортировка с текста, всех электронных почт и адресов по формату, улица, номер дома и квартиры
        RegEx("email:\\s*(\\w+@\\w+\\.\\w+)",s);
        RegEx("(?<=, |^)(\\w|\\s)*\\bstreet\\b, \\d+, \\bflat\\b \\d+",s);

        //%[flags][width][.precision]datatype_specifier
        //flags "-" выравнить по левому краю, "0" количество нулей перед числом, "." разделитель в числах
        //datatype_specifier b-boolean, c-character, s-string, d-integer, f-float
        System.out.printf("%1$03d \t\t %2$+07.2f \t\t  %3$s",15,7.01,"Ветер");
    }

    public static void RegEx(String pattern, String s) {
        Pattern patM = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
        Matcher matM = patM.matcher(s);
        System.out.println("____________________________________________");
        while (matM.find()) System.out.println("Position: "+matM.start()+" = \""+matM.group()+"\"");

    }
    public static void CheckIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip + " IP адресс введен верно ? " + Pattern.matches(regex, ip));
    }
}
