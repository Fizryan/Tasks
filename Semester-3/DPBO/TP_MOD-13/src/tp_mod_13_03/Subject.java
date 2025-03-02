package tp_mod_13_03;
/**
 *
 * @author Hafizryandin HM
 */
public class Subject {
    private String name;
    private int score;
    
    public Subject (String name, int score){
        this.name = name;
        this.score = score;
    }
    
    public String getName(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
}
