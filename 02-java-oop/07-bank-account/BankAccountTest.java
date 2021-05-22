public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount mine = new BankAccount();
        mine.depositMoney(100, "checking");
        mine.displayAccountBalance();
        System.out.println(BankAccount.totalHoldings);
    }
}
