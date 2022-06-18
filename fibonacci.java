public class fibonacci {
    static int num1=0,num2=1,num3;
    public static void printFibonacci(int x){
        if(x>0){
            for(int i = 3 ; i<=x;i++){num3 = num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(" " + num3);}
        }
    }
    public static void  main(String[] args){
        int count = 10;
        System.out.print(num1 + " "+ num2);
        printFibonacci(count-2);
    }
}
