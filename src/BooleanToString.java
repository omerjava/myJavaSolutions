    /* Implement a function which convert the given boolean value into its string representation.

        Note: Only valid inputs will be given.

        https://www.codewars.com/kata/551b4501ac0447318f0009cd/java
    */

public class BooleanToString {
    public static void main(String[] args) {
        System.out.println(convert(true));
        System.out.println(convert(false));
    }
    public static String convert(boolean b){
        String result =String.valueOf(b);
        return result;
    }
}
