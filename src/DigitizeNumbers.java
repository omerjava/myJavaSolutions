    /* Convert number to reversed array of digits
        Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

        Example:
        348597 => [7,9,5,8,4,3]
        0 => [0]

        https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/javascript
     */
    import java.util.Arrays;

public class DigitizeNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(348597)));
        //System.out.println(Arrays.toString(digitize2(348597)));

    }
    public static int[] digitize(long n) {
        String number=String.valueOf(n);
        StringBuilder sb=new StringBuilder(number);
        String reversed=sb.reverse().toString();
        String[] numArr=reversed.split("");
        int[]reversedDigits=new int[numArr.length];
        for(int i=0; i<numArr.length; i++){
            reversedDigits[i]=Integer.parseInt(numArr[i]);
        }
        return reversedDigits;
    }
    /* public static int[] digitize2(long n) {
        int num=(int)n;
        System.out.println(num);
        String numbers=Integer.toString(num);
        System.out.println(numbers);
        String[] numArr=numbers.split("");
        System.out.println(Arrays.toString(numArr));
        int[]result=new int[numArr.length];
        for(int i=numArr.length-1;i>=0; i--){
            int j=0;
            int x=Integer.valueOf(numArr[i]);
            result[j]=x;
            System.out.println(result[j]);
        }
        System.out.println(Arrays.toString(result));
        return result;
    } */
}
