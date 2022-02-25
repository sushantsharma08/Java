public class arrayOfString {
    public static void main(String[] args) {

// 1 meathod to make array

        String[] array= new String[4];
        array[0]= "hello";
        array[1]= "how";
        array[2]= "are";
        array[3]="you";

        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }


            System.out.println("\n");
// meathod 2 to make array : 

        String[] arrayTwo = {"hello ", "how ", "are  ", "you ", "i ", "am ", "array2 "};
        // System.out.println(arrayTwo[2]);
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.printf(arrayTwo[i]);
        }
        String text="twstinfg the string type";
        System.out.println(text);
    }
}
