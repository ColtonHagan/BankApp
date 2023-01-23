import java.util.Random;

public class Customer {
    private String name;
    private Account account;
    private String password;

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public Customer(String name) {
        this.name = name;
    }

    public void createAccount(Bank bank, double money) {
        Random rand = new Random();
        int id = rand.nextInt(1000);
        password = new PasswordGenerator().generate(8);
        account = new Account(id, password, money);
        //System.out.println("New account: " + bank.addAccount(account));
        if(!bank.addAccount(account)) createAccount(bank, money);
    }

    public void deposite(double amt) {
        account.deposite(amt, password);
    }

    public void withdraw(double amt) {
        account.withdraw(amt, password);
    }

}
