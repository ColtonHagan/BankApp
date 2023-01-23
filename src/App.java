//Not learning anythings from this so will not finish this by doing cleanup and adding UI
public class App {
    private static Bank bank = new Bank();
    public static void main(String[] args) throws Exception {
        //TODO add some sort of UI
        test();
    }

    private static void test() {
        Customer test = new Customer("Test");
        test.createAccount(bank, 1000);
        test.deposite(1000);
        test.deposite(-1);
        test.withdraw(2000);
        test.withdraw(10);
        test.deposite(100.53);
        test.deposite(20000);
        Customer two = new Customer("Test");
        two.createAccount(bank, 0);
        two.deposite(1000000);
        two.withdraw(105.25);
        two.withdraw(10000);
        two.withdraw(500000);
        two.withdraw(100000);
        two.withdraw(389800.00);
        System.out.println(bank.toString());
    } 
}
