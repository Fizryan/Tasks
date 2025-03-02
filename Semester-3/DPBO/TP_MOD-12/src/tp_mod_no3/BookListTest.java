package tp_mod_no3;
/**
 *
 * @author Hafizryandin HM
 */

import java.util.ArrayList;

public class BookListTest {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Rules of Java", 346, 15000));
        bookList.add(new Book("Oracle 11g", 560, 18000));
        bookList.add(new Book("Copying JSP", 271, 12000));
        
        for (int i = 0; i < bookList.size(); i++){
            System.out.println((i + 1) + ". " + bookList.get(i));
        }
    } 
}
