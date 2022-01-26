    /* Your task is to remove all consecutive duplicate words from a string, leaving only first words entries. For example:

        "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"

        --> "alpha beta gamma delta alpha beta gamma delta"

        https://www.codewars.com/kata/5b39e91ee7a2c103300018b3
    */


    import java.util.Arrays;

    public class RemoveConsecutiveDuplicateWords {
        public static void main(String[] args) {
            System.out.println(removeConsecutiveDuplicates("alpha beta beta gamma gamma gamma delta " +
                    "alpha beta beta gamma gamma gamma delta"));
        }
    public static String removeConsecutiveDuplicates(String s){
        String [] arr=s.split(" ");
        String result=arr[0];
        for(int i=1; i<arr.length; i++){
            if(!arr[i].equals(arr[i-1])){
              result+=" "+arr[i];
            }
        }
        return result;
    }
}
