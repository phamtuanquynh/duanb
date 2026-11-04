public class Bank {
    private Account[] accounts;

    Bank(Account[] accounts) {
        this.accounts = accounts;
    }


    long totalBalance() {
        long total = 0;
        for (Account acc : accounts) {
            total += acc.getBalance();
        }
        return total;
    }
    Account findByOwner(String owner) {
        for (Account acc : accounts) {
            if (acc.getOwner().equals(owner)) {
                return acc;
            }
        }
        return null;
    }
}