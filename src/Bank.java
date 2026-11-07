public class Bank {
    public Account[] accounts;

 public Bank(Account[] accounts) {
        this.accounts = accounts;
    }
    public  long totalBalance() {
        long total = 0;
        for (Account acc : accounts) {
            total += acc.getBalance();
        }
        return total;
    }
    public  Account findByOwner(String owner) {
        for (Account acc : accounts) {
            if (acc.getOwner().equals(owner)) {
                return acc;
            }
        }
        return null;
    }
}
