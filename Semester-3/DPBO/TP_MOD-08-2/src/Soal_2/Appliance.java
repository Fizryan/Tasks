package Soal_2;

/**
 *
 * @author Hafizryandin HM
 */
public class Appliance {
    private String product;
    private String place;
    public void turnOn(){
        System.out.println(product + " : On");
    }
    public void turnOff(){
        System.out.println(product + " : Off");
    }
    public void setProduct(String product){
        this.product = product;
    }
}
