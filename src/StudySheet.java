import java.util.Arrays;

public class StudySheet {
    public static void main(String[] args) {
        String str="My name is Omer";
        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        String joinedStr=String.join(" ",arr);
        System.out.println("joined array: "+ joinedStr);

        String str2 = String.join(" ", "My", "name", "is", "Niraj", "Pandey");
        System.out.println(str2);

        String str3="umbrella";
        String result="";
        for(int i=str3.length()-1; i>=0; i--){
            result+=" "+str3.charAt(i);
        }
        System.out.println(result);

        // str.substring(begin index, end index); to remove some parts of strings
        String lastLetterRemoved=str3.substring(0,str3.length()-1);
        System.out.println(lastLetterRemoved);
        String firstLetterRemoved=str3.substring(1,str3.length());
        System.out.println(firstLetterRemoved);
        String middleLetters=str3.substring((str3.length()/2)-1,(str3.length()/2)+1);
        System.out.println(middleLetters);

        //converts boolean values to string
        String booleanString =String.valueOf(true);
        System.out.println(booleanString);
        String booleanToStr=Boolean.toString(false);
        System.out.println(booleanToStr);

        // a.equals(b) => check equality
        if(str3.equals("umbrella")) System.out.println(true);
        else System.out.println(false);

        String str4 = new StringBuilder(str3).reverse().toString();
        System.out.println(str4);

        String hello="Hello";
        StringBuilder sb=new StringBuilder(hello);
        sb.insert(hello.length()," Java");
        System.out.println(sb);

        String s1="Sachin";
        String s2="SACHIN";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        double d=10.5;
        int i=(int)d;
        double k=110.039;
        int j=(int)k+5;
        double h=j;
        System.out.println(i);
        System.out.println(j);
        System.out.println(h);



    }


}
