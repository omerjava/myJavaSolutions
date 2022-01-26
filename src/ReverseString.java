    /* Complete the solution so that it reverses the string passed into it.

        'world'  =>  'dlrow'
        'word'   =>  'drow'

        https://www.codewars.com/kata/5168bb5dfe9a00b126000018
    */

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(solution("long bridge"));
    }
    public static String solution(String str) {
        String result="";
        for(int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        return result;
    }
}
