
public class Factorial {
    public static int calcFactorial(int x){
        if(x==0)
            return 1;
        return x*calcFactorial(x-1);
          }
    public static void main(String[] args) {
        System.out.println(calcFactorial(5));
    }
}
