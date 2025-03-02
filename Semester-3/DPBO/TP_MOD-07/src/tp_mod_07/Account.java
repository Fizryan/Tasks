package tp_mod_07;
/**
 *
 * @author Hafizryandin HM
 */
public abstract class Account {
    private final String number;
    private final String name;
    private final int balance;
    public Account(String number, String name, int balance){
        this.number = number;
        this.name = name;
        this.balance = balance;
    }
    public String getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public abstract void openAccount();
}
