import java.util.Scanner;

public class scanner{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("enter YOur full name");
        String line = input.nextLine();
        System.out.println("You entered : " + line);
        
        Scanner valueInt = new Scanner(System.in);
        System.out.println("enter age");
        int value = valueInt.nextInt();
        System.out.println("you entered " + value);

        Scanner salary = new Scanner(System.in);
        System.out.println("eneter your annual Income");
        double earning = salary.nextDouble();
        System.out.println("your Annual Income is " + earning);
    }
}