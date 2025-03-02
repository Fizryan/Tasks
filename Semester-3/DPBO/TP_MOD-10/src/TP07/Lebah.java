package TP07;
/**
 *
 * @author Hafizryandin HM
 */
public class Lebah extends Serangga implements BisaTerbang{
    private Koordinat3D posisi;
    
    public Lebah(String warna, int x, int y, int z){
        super(warna);
        this.posisi = new Koordinat3D(x, y, z);
    }
    
    @Override
    public void gerak(int[] sumbu){
        if (sumbu.length == 3){
            posisi.setX(sumbu[0]);
            posisi.setY(sumbu[1]);
            posisi.setZ(sumbu[2]);
        }
    }
    
    @Override
    public void info(){
        System.out.println("Posisi Lebah : X = " + posisi.getX());
        System.out.println("               Y = " + posisi.getY());
        System.out.println("               Z = " + posisi.getZ());
    }
    
    @Override
    public void terbang(int x, int y, int z){
        posisi.setX(posisi.getX() + x);
        posisi.setY(posisi.getY() + y);
        posisi.setZ(posisi.getZ() + z);
    }
}
