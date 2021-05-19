public class StoreTester {
    public static void main(String[] args) {
        
        Order o = new OnlineOrder(123, 300, "guitar");

        System.out.println(o.displayOrder());
        o.cancel();
    }
}
