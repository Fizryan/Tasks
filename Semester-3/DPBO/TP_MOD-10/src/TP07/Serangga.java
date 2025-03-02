package TP07;
/**
 *
 * @author Hafizryandin HM
 */
public class Serangga {
    private final int jumlahKaki = 6;
    private String warna;
    
    public Serangga(String warna){
        this.warna = warna;
    }
    
    public void gerak(int[] sumbu){}
    
    public int getJumlahKaki(){
        return jumlahKaki;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void info(){}
    
    public void setWarna(String warna){
        this.warna = warna;
    }
}
