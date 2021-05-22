public class PhoneTest {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 100, "Verizon", "Mango Smash");
        IPhone iphone10 = new IPhone("X", 99, "Verizon", "Army of the Dead");
        s9.displayInfo();
        iphone10.displayInfo();
    }
}
