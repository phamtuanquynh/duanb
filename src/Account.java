public class Account {
    private static int openedCount = 0;
    private String owner;
    private long balance;
    Account(String owner, long openingBalance) {
        this.owner = owner;
        this.balance = Math.max(openingBalance, 0);
        openedCount++;
    }
    boolean deposit(long amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }
    boolean withdraw(long amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
    long getBalance() { return balance; }

    String getOwner() { return owner; }

    static int getOpenedCount() { return openedCount; }

    @Override
    public String toString() {
        return "Account[owner=" + owner + ", balance=" + balance + "]";
    }
}