import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float P ,R ,T, SI;
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate Simple Interest \n");
        System.out.println("Enter the Principal amount : ");
        P= sc.nextFloat();
        System.out.println("Enter the Rate of Interest : ");
        R= sc.nextFloat();
        System.out.println("Enter the Time (in years) : ");
        T= sc.nextFloat();
        SI = (P*R*T)/100;
        System.out.println("Simple Interest on principal amount of "+P +" at the annual interest rate of "+R+" for the time "+ T + " (in years) will be : "+SI);
    }
}