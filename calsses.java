import java.util.Scanner; 
interface Marks{ 
void getPercentage(); 
} 
class A implements Marks{ 
float marks[]=new float[3]; 
Scanner sc=new Scanner(System.in); 
A() 
{ 
System.out.println("Enter the marks of student A: "); 
for(int i=0;i<3;i++) 
{ 
marks[i]=sc.nextFloat(); 
} 
} 
public void getPercentage() 
{ 
float total=0; 
for(int i=0;i<3;i++) 
{ 
total=total+marks[i]; 
} 
System.out.println("Percentage of A: "+(total/300*100)); 
} 
} 
class B implements Marks{ 
Scanner sc=new Scanner(System.in); 
float marks[]=new float[4]; 
B() 
{ 
System.out.println("Enter the marks of student B: "); 
for(int i=0;i<4;i++) 
{ 
marks[i]=sc.nextFloat(); 
} 
} 
public void getPercentage() 
{ 
float total=0; 
for(int i=0;i<4;i++) 
{ 
total=total+marks[i]; 
} 
System.out.println("Percentage of A is: "+(total/400*100)); 
} 
} 
public class Main 
{ 
public static void main(String[] args) { 
System.out.println("Name: Sparsh Garg"); 
System.out.println("ENROLLMENT Number: EN20CS301451"); 
A a=new A(); 
B b=new B(); 
a.getPercentage(); 
b.getPercentage(); 
} 
} 
