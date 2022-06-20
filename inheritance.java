 class ToBeInherited {
    static void show(){
        System.out.println("This is a inherited class meathod");
    }
}

public class inheritance extends ToBeInherited{
    
    public static void main(String srgs[]){
        inheritance.show();
    }
}
