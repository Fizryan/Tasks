package tp_mod_07;
/**
 *
 * @author Hafizryandin HM
 */
public class FundAccount extends Account {
    private double earningRate;
    public FundAccount(String number, String name, int balance, double earningRate){
        super(number, name, balance);
        this.earningRate = earningRate;
    }
    public double getEarningRate() {
        return earningRate;
    }
    public void earnMoney() {
        System.out.println("Keuntungan telah diperoleh.");
    }
    public void openAccount() {
        System.out.println("Buka akun.");
    }
}
