package tp_mod_07;

/**
 *
 * @author Hafizryandin HM
 */
public class AccountMain {
    public static void main(String[] args) {
        FundAccount fundAccount = new FundAccount("111-2222", "Ariq Heritsa", 5000000, 4.7);
        fundAccount.openAccount();
        System.out.println("Nomor rekening: " + fundAccount.getNumber());
        System.out.println("Pemilik akun: " + fundAccount.getName());
        System.out.println("Saldo: Rp." + fundAccount.getBalance());
        System.out.println("Tingkat pengembalian: " + fundAccount.getEarningRate() + "%");
        fundAccount.earnMoney();
    }
}
