package tp_mod_13_02;

import java.util.ArrayList;

/**
 *
 * @author Hafizryandin HM
 */
public class TeaterEntranceTest {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        
        people.add(new Person("Hong Gil-dong", 23));
        people.add(new Person("Hong Gil-sun", 17));
        
        System.out.println("Masuk ke Bioskop.");
        for (Person person : people){
            System.out.print(person.getName() + ": ");
            
            try{
                if (person.getAge() < 19){
                    throw new Exception("Dilarang Masuk!!");
                } else {
                    System.out.println("Silahkan Masuk~");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
