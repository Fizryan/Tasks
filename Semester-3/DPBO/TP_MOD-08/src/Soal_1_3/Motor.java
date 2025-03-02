package Soal_1_3;
/**
 *
 * @author Hafizryandin HM
 */
public class Motor extends Kendaraan{
    public Motor(String namaKendaraan) {
        super(namaKendaraan);
    }
    
    @Override
    public String getInfo(){
        return "Motor: " + namaKendaraan;
    }
}
