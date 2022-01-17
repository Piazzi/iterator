import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TableTest {

    @Test
    public void shouldCountActiveTables() {
        Waiter waiter = new Waiter("Lucas");
        Restaurant restaurant = new Restaurant(
                new Table("01", true, waiter),
                new Table("02", false, waiter),
                new Table("03", false, waiter),
                new Table("04", false, waiter)
        );
        assertEquals(1, Waiter.countActiveTables(restaurant));
    }

    @Test
    public void shouldCountNumOfTables() {
        Waiter waiter = new Waiter("Lucas");
        Restaurant restaurant = new Restaurant(
                new Table("01", true, waiter),
                new Table("02", false, waiter),
                new Table("03", false, waiter),
                new Table("04", true, waiter)
        );
        assertEquals(4, Waiter.countTables(restaurant));
    }

}