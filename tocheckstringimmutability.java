public class tocheckstringimmutability{
    public static void referenceCheck(Object x, Object y) {  
        if (x == y) {  
            System.out.println("Both pointing to the same reference");  
   
        } else {  
            System.out.println("Both are pointing to different reference");  
        }  
    }  
    public static void main(String[] args) {  
        String st1 = "sir";  
        String st2 = "sir";  
        System.out.println("Before Modification in st1");  
        System.out.println(st1);  
        System.out.println(st2);  
        referenceCheck(st1, st2);  
        st1 += "mam";  
        System.out.println("After Modification");  
        referenceCheck(st1, st2); 
        
        System.out.println(st1);  
        System.out.println(st2);
    } 
}