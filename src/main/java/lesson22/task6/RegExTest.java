package lesson22.task6;

import java.util.regex.Pattern;

public class RegExTest {

    public static void main(String[] args) {

        System.out.println(checkString("A"));
        System.out.println(checkString(""));
        System.out.println(checkString("B"));
        System.out.println(checkString("C"));
        System.out.println(checkString("ABC"));
        System.out.println(checkString("CBA"));
        System.out.println(checkString("CAAAABBBBCCCBA"));
        System.out.println(checkString("CAAAABBBDBCCCBA"));
        System.out.println(checkString("TYNKISW"));
        System.out.println(checkString("TYNKISWfsdfabc"));
        System.out.println(checkString("TYNKISWfs$#dfabc"));
        System.out.println(checkString("DFNBGDYUAKLPODFFGFDS"));
        System.out.println(checkString("DFNBGDUAKLPODFFGFDS"));
        System.out.println(checkString("DFNBGDUAKLPODFFGFDSyz"));
        System.out.println(checkString("DFNBGDUAKLPODFFGFDSvcxfds"));
        System.out.println(checkString("DFNBGDUAKLPODFFGFDSvcxfds45834"));
    }

    public static boolean checkString(String source) {

//        String regex = "[ABC]+";
//        String regex = "[^ABCabc]+";
//        String regex = "[A-Z]+";
//        String regex = "[A-Xa-x]+";
        String regex = "[A-Xa-x3-8]+";
        Pattern pattern = Pattern.compile(regex);
        System.out.print("Проверяемая строка - " + source + ": ");
        return pattern.matcher(source).matches();
    }
}
