package tp_mod_no2;
/**
 *
 * @author Hafizryandin HM
 */

import java.util.*;
public class CollectionTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Bernadine");
        set.add("Elizabeth");
        set.add("Gene");
        set.add("Elizabeth");
        set.add("Clara");
        System.out.print("Element Pada HashSet: ");
        System.out.println(set);
        Set sortSet = new TreeSet(set);
        System.out.print("Element Pada TreeSet: ");
        System.out.println(sortSet);
    }
}
