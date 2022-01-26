  /* Complete the function that accepts a string parameter, and reverses each word in the string.
     All spaces in the string should be retained.

       Examples
       "This is an example!" ==> "sihT si na !elpmaxe"
       "double  spaces"      ==> "elbuod  secaps"

       https://www.codewars.com/kata/5259b20d6021e9e14c0010d4
  */

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("My name is Omer"));
    }
    public static String reverseWords(final String original) {
       String [] arr=original.split(" ");
       if(arr.length==0) return original;
       String last="";
       for(int i=0; i< arr.length; i++){
           last+=reverse(arr[i])+" ";
       }
        String result=last.substring(0,last.length()-1);
        return result;
    }
    public static String reverse( String str){
        String result="";
        for(int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        return result;
    }
}

