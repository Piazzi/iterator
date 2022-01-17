import java.util.Iterator;

public class Waiter {

    private String name;

    public Waiter(String name) {
        this.name = name;
    }

    public static Integer countActiveTables(Restaurant restaurant) {
        int numOfActiveTables = 0;
        for (Table table : restaurant)
            if (table.hasClient())
                numOfActiveTables++;
        return numOfActiveTables;
    }

    public static Integer countTables(Restaurant restaurant) {
        int numOfTables = 0;
        for (Table table : restaurant)
                numOfTables++;
        return numOfTables;
    }

}
