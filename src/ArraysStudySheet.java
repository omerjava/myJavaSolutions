import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class ArraysStudySheet {

    public static void main(String[] args) {

        Integer[] arr={1,2,3,4,5,6,7};    // created a new array
        List<Integer> myList = Arrays.asList(arr);   //the array has been converted to list with Arrays.asList()
        ArrayList<Integer> arrList2 = new ArrayList<>(myList); //new arraylist is created with using list as argument
        for(int i=9; i<20; i++){
            arrList2.add(i);                    // new elements are added to arraylist
        }
        Integer[] myNewArray = arrList2.toArray(new Integer[0]);  // arraylist is converted back to a new array

        System.out.println("The new array is: " + Arrays.toString(myNewArray));
        System.out.println("The list is: " + myList);
        System.out.println("The arraylist is: " + arrList2);

        List<Integer> list = new  ArrayList<>();
        // Add elements to the list
        list.add(5);
        list.add(10);
        list.add(15);
        // Convert ArrayList to Array
        Integer[] array = list.toArray(new Integer[0]);

        for (Integer n : array) {
            System.out.println(n);
        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(50);
        System.out.println("The list4 is: " + list3);

        Integer[] arrFirst={1,2,3,4};
        Integer[] arrSecond=new Integer[arrFirst.length+1];
        for(Integer i=0; i<arrFirst.length; i++) {
            arrSecond[i]=arrFirst[i];
        }
        arrSecond[arrSecond.length-1]=5;

    }

    public Integer[] add(Integer n){
        Integer[] arrFirst={1,2,3,4};
        Integer[] arrSecond=new Integer[arrFirst.length+1];
        for(Integer i=0; i<arrFirst.length; i++) {
            arrSecond[i]=arrFirst[i];
        }
        arrSecond[arrSecond.length-1]=n;
        return arrSecond;
    }

}
