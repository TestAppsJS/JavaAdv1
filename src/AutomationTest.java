import org.junit.Assert;
import org.junit.Test;

public class AutomationTest {

    @Test
    public void scenariul1() {
        Employee e = new Employee();
        e.name = "Bogdan";
        e.salary = 1000;
        e.age = 20;
        int bonus = e.calcBonus();
        Assert.assertEquals(1000, bonus);
    }
    @Test
    public void scenariul2() {
        Employee e = new Employee();
        e.name = "Bogdan";
        e.salary = 1000;
        e.age = 45;
        int bonus = e.calcBonus();
        Assert.assertEquals(3000, bonus);
    }
}
