package tp_mod_no4;
/**
 *
 * @author Hafizryandin HM
 */
public class Student {
    private String name;
    private int bKorea;
    private int bInggris;
    private int math;
    
    public Student(String name, int bKorea, int bInggris, int math){
        this.name = name;
        this.bKorea = bKorea;
        this.bInggris = bInggris;
        this.math = math;
    }
    
    @Override
    public String toString(){
        return name + " (Bahasa Korea: " +  bKorea + ", Bahasa Inggris: " 
        + bInggris + ", Matematika: " + math; 
    }
}
