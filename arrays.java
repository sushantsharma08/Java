import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        // int[] values;
        // values = new int[3];
        // values[0] = 10;
        // values[1] = 20;
        // values[2] = 30;

        // for (int i = 0; i < values.length; i++) {
        //     System.out.println("element at " + i +" is " + values[i]);
        // }


        System.out.println("Enter the size of the array ");
        Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int[] array;
            array= new int[x];

            for (int i = 0; i < array.length; i++) {
                
                Scanner element = new Scanner(System.in);
                System.out.println("enter the " + i + " element of array");
                array[i] = element.nextInt();
            }

            System.out.println(" array as follows : ");
            for (int i = 0; i < array.length; i++) {
                System.out.printf(" array[%d] : " + array[i] +"\n",i);
            }

            int[] numbers = {1,2,3,4};
            for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
            }
    }
}
