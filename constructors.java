
class Machine {
      String name;
    private int code;

    public Machine() {
        System.out.println("constructor working!!!");
    }

    public Machine(String name) {
        System.out.println("second constructor running");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("third constructor running");
        this.name = name;
        this.code = code;
    }
}

public class constructors {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("saw");
        Machine machine3 = new Machine("grinder" , 1);
        System.out.println(machine3.name);
        String name3 =machine3.name;
        // System.out.println(machine3);
        System.out.println(name3);   
        
    }
}
