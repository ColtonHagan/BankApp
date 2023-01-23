public class Account {
    private double balance;
    private int id;
    private String password;

    public Account(int id, String password, double intBalance) {
        this.id = id;
        this.password = password;
        balance = intBalance;
    }

    public boolean withdraw(double amt, String password) {
        if(!checkPassword(password)) return false; 
        if(amt < 0) {
            errMsg("Can't withdraw negative amount of money");
            return false;
        }
        if(amt > balance) {
            errMsg("Can't withdraw more then your balance of " + balance);
            return false;
        }
        balance -= amt;
        System.out.println(toString());
        return true;
    }

    public boolean deposite(double amt, String password) {
        if(!checkPassword(password)) return false; 
        if(amt < 0) {
            errMsg("Can't deposite negative amount of money");
            return false;
        }
        balance += amt;
        System.out.println(toString());
        return true;
    }

    public int getId() {
        return id;
    }

    private boolean checkPassword(String pswd) {
        if(pswd != password) {
            errMsg("Password is not correct");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Account #" + id + " has balance of $" + balance; 
    }

    private void errMsg(String msg) {
        System.out.println("Error: " + msg + ", please re-enter information");
    }
}
