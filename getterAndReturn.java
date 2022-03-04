class person {
    String name;
    int age;

    int yearsLeft() {
        int y = 65 - age;
         return y;
    }
}


public class getterAndReturn {
    public static void main(String[] args) {
        person person1 = new person();
        person1.age=40;
        int yearsTillRetirement = person1.yearsLeft();
        System.out.println(yearsTillRetirement);
    }
}
