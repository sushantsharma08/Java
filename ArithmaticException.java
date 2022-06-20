public class ArithmaticException {
    public static void main(String args[]){
        int n =100;

        try {
            int x =n/0;
            System.out.println(x);
        } 
        catch (ArithmeticException e) {
            System.out.println("cannot divied by 0");
        }
    }
}
