package Soal_1_3;

/**
 *
 * @author Hafizryandin HM
 */
public class Mobil extends Kendaraan{
    public Mobil(String namaKendaraan) {
        super(namaKendaraan);
    }
    
    @Override
    public String getInfo(){
        return "Mobil: " + namaKendaraan;
    }
}
