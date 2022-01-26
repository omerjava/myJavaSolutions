    /* Write a function called repeatStr which repeats the given string exactly n times.

        repeatStr(6, "I") // "IIIIII"
        repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"

        https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
     */

public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(7,"Hello"));
    }
    public static String repeatStr(final int repeat, final String string) {
        String result="";
        for(int i=0; i<repeat; i++){
            result+=string;
        }
        return result;
    }
}
