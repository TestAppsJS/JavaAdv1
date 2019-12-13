public class Main {


    public static void main(String[] args) {
        Employee bogdan = new Employee();
        bogdan.name = "Bogdan";
        bogdan.salary = 9000;
        bogdan.age = 45;
       int b =  bogdan.calcBonus();
        System.out.println(b);
    }
}


