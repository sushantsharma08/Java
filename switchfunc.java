
import java.util.Scanner;

public class switchfunc {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       System.out.println("1. A \n2. B\n3. C\n4. D");
       System.out.println("Enter your choice");
        int value = scanner.nextInt();
        System.out.println("you entered "+ value);
        System.out.println("your Output is :  ");
        switch (value) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            default:
            System.out.println("undefined input");
                break;
        }

    }
}
