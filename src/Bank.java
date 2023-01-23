import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Account getAccount(int id) {
        for (Account account : accounts) {
            if(account.getId() == id) return account;
        }
        return null;
    }

    public Bank() {
        accounts = new ArrayList<>();
    }

    public boolean addAccount(Account acc) {
        if(!validAccount(acc.getId())) return false;
        accounts.add(acc);
        return true;
    }

    public boolean removeAccount(Account acc) {
        if(validAccount(acc.getId())) return false;
        accounts.remove(accounts.indexOf(acc));
        return true;
    }

    private boolean validAccount(int id) {
        for (Account account : accounts) {
            if(account.getId() == id) {
                System.out.println("Error: Account already exists");
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Accounts: \n");
        for (Account account : accounts) {
            str.append("   " + account.toString() + "\n");
        }
        return str.toString();
    }
}
