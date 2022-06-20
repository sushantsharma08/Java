
class Employee{
    static int salary=40000;
    void salary(){
        System.out.println(salary);
    }
}

class Programmer extends Employee{
    static int bonus = 20000;
    void bonus(){
        System.out.println(bonus);
    }
}

class jrProgrammer extends Programmer{
    int bonus = 10000;
    void bonus(){
        System.out.println(bonus);
    }
}

public class multiLvlInheritance {
    public static void main (String[] args){
        Programmer p1 = new Programmer();
        jrProgrammer jrp1 = new jrProgrammer();

        p1.salary();
        p1.bonus();
        jrp1.salary();
        jrp1.bonus();
    }
}
