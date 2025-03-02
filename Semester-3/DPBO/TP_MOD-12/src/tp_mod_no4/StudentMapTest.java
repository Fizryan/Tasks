package tp_mod_no4;
/**
 *
 * @author Hafizryandin HM
 */

import java.util.HashMap;
public class StudentMapTest {
    public static void main(String[] args) {
        HashMap<String, Student> studentList = new HashMap<>();
        studentList.put("STU001", new Student("Lee Sun-shin", 80, 90, 95));
        studentList.put("STU002", new Student("Kim Yu-shin", 95, 89, 92));
        studentList.put("STU003", new Student("Kang Gam-chan", 88, 97, 94));
        
        for (String nim : studentList.keySet()){
            System.out.println(nim + " - " + studentList.get(nim));
        }
    }
}
