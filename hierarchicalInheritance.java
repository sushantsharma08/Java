class A {
    void what(){
        System.out.println("it is a alphabet");
        }
}
class B extends A{
    void show(){
        System.out.println("its a B");
    }
}
class C extends A {
    void show(){
        System.out.println("its a C");
    }
}

public class hierarchicalInheritance {
  public static void main(String args[]){
    C c = new C();
    c.what();
  }   
}
