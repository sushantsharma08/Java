import java.util.Scanner;

public class scanner{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a line of text");
        String line = input.nextLine();
                                    
        System.out.println("You entered : " + line);
    }
}