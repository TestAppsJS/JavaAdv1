public class Employee {



    String name;
    int salary;
    int age;

    public int calcBonus() {
        if (age > 40) {
            return salary * 2;
        }
        if (age > 30) {
            return salary * 2;
        }
        return salary;
    }
}
