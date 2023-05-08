import java.math.BigInteger;
public class CODEWARS {
    public static void main(String[] args) {
        String str = "foobar000";
        String res = "";
        res = incrementString(str);
        System.out.println(res);//foobar001
        str = "foo";
        res = "";
        res = incrementString(str);
        System.out.println(res);//foo1
        str = "foobar001";
        res = "";
        res = incrementString(str);
        System.out.println(res);//foobar002
        str = "foobar99";
        res = "";
        res = incrementString(str);
        System.out.println(res);//foobar100
        str = "foobar099";
        res = "";
        res = incrementString(str);
        System.out.println(res);//foobar100
        str = "";
        res = "";
        res = incrementString(str);
        System.out.println(res);//1
    }
    public static String incrementString(String str) {
        if (str.isEmpty()) {
            return "1";
        }

        int numIndex = str.length() - 1;
        while (numIndex >= 0 && Character.isDigit(str.charAt(numIndex))) {
            numIndex--;
        }

        String base = str.substring(0, numIndex + 1);
        String numberStr = str.substring(numIndex + 1);

        if (numberStr.isEmpty()) {
            return base + "1";
        }

        BigInteger number = new BigInteger(numberStr).add(BigInteger.ONE);
        String format = "%0" + numberStr.length() + "d";

        return base + String.format(format, number);
    }
}