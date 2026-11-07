public class Main {
    public static void main(String[] args) {
        
        Account an = new Account("An", 500_000);
        Account binh = new Account("Bình", 0);
        an.deposit(200_000);
        boolean ok = binh.withdraw(50_000);
        
        System.out.println(an);
        System.out.println(binh);
    
        System.out.println("Bình rút được không? " + ok);
        System.out.println("Tổng số tài khoản: " + Account.getOpenedCount());
        
        Bank bank = new Bank(new Account[] { an, binh });
        
        System.out.println("Tổng số dư: " + bank.totalBalance());
        Account found = bank.findByOwner("An");
        
        if (found != null) {
            System.out.println("Tìm thấy: " + found);
        } else {
            System.out.println("Không tìm thấy An");
        }
        Account missing = bank.findByOwner("Cường");
        if (missing != null) {
            System.out.println("Tìm thấy: " + missing);
        } else {
            System.out.println("Không tìm thấy Cường");
        }
    }
}
