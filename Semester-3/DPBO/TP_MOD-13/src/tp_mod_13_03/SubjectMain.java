package tp_mod_13_03;
/**
 *
 * @author Hafizryandin HM
 */
import java.util.ArrayList;

public class SubjectMain {
    public static void main(String[] args) {
        ArrayList<Subject> subject = new ArrayList<Subject>();
        
        subject.add(new Subject("Sejarah", 86));
        subject.add(new Subject("Geografi", 65));
        subject.add(new Subject("Biologi", 58));
        subject.add(new Subject("Fisika", 76));
        
        System.out.println("Pelajaran yang perlu kelas tambahan");
        for (Subject siswa : subject){
            try{
                if (siswa.getScore() < 70){
                    throw new Exception(siswa.getName() + " ( " + siswa.getScore() + " poin )");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
