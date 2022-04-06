import java.util.Scanner;
public class stringcontain {
    public static void check(String a, String b){
        if (a.contains(b)){
            System.out.println("string1 contains string2");
        } else {
            System.out.println("string1 does not contains string2");
        }
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        check(str1,str2);

    }
}