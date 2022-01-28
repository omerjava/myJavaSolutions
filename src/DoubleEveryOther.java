/* Write a function that doubles every second integer in a list, starting from the left.

        Example:

        For input array/list :

        [1,2,3,4]
        the function should return :

        [1,4,3,8]

        https://www.codewars.com/kata/5809c661f15835266900010a/train/java
 */


import java.util.Arrays;

public class DoubleEveryOther {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(doubleEveryOther(new int[]{1, 4, 5, 7, 8, 9})));
    }
    public static int[] doubleEveryOther(int[] a){
        for(int i=1; i<a.length; i=i+2){
            a[i]=a[i]*2;
        }
        return a;
    }
}

