
public class nullPointerException {
    public static void main(String args[]) {
        String str= null;
        try {
            System.out.println(str.length());
        } 
        catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("1,2,3,4,5,6");

    }
}
