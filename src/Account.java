public class Account {
    private static int openedCount = 0;
    private String owner;
    private long balance;
    
 public Account(String owner, long openingBalance) {
        this.owner = owner;
        this.balance = Math.max(openingBalance, 0);
        openedCount++;
    }
  public boolean deposit(long amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }
   public boolean withdraw(long amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
   public long getBalance() { return balance; }

  public String getOwner() { return owner; }

 public static int getOpenedCount() { return openedCount; }

    @Override
    public String toString() {
        return "Account[owner=" + owner + ", balance=" + balance + "]";
    }
}
