import java.util.Scanner;
public class labJava {
    public static void main(String[] args) {
        String Fname,Lname;

        System.out.println("Enter your name \n");
        
        System.out.println("First name: ");
        Scanner sc = new Scanner(System.in);
        Fname = sc.next();
        System.out.println("last name:  ");
        Lname = sc.next();
        System.out.println("Name : " + Fname + " " +Lname);
        // by concat meathod 
        Fname=Fname.concat(Lname);
        System.out.println(Fname);
    }
}
