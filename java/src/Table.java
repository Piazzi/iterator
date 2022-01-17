public class Table {

    private String name;
    private boolean hasClient;
    private Waiter waiter;

    public Table(String name, boolean hasClient, Waiter waiter) {
        this.name = name;
        this.hasClient = hasClient;
        this.waiter = waiter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasClient() {
        return hasClient;
    }

    public void setHasClient(boolean hasClient) {
        this.hasClient = hasClient;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }
}
