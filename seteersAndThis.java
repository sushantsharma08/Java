class Frog{
   private String name;
    private int age;

    // void set_name(String newname){
    //     name = newname;
    // }
    
    // void set_age(int newage){
    //     age=newage;
    // }

            // now using this. meathod
    void set_name(String name){
        this.name = name ;
    }
    
    void set_age(int age){
      this.age = age;
    }

    String get_name(){
        return name;
    }

    int get_age(){
        return age;
    }

}


public class seteersAndThis {
    public static void main(String[] args){

        Frog frog1 = new Frog();
        frog1.set_name("magarmach");
        frog1.set_age(1);

        System.out.println(frog1.get_name());
        System.out.println(frog1.get_age());

    }
}
