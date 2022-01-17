import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Restaurant implements Iterable<Table>{

    private List<Table> tables;
    private String name;

    public Restaurant(Table... tables) {
        this.tables = Arrays.asList(tables);
    }

    @Override
    public Iterator<Table> iterator() {
        return tables.iterator();
    }

}


