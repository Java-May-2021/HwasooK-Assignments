public abstract class Order {
    private int id;
    private int total;
    private String name;

    public Order (int id, int total, String name) {
        this.id = id;
        this.total = total;
        this.name = name;
    }

    public abstract void cancel();

    public String displayOrder() {
        return this.name;
    }

    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
