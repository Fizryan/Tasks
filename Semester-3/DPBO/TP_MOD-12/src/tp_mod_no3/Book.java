package tp_mod_no3;
/**
 *
 * @author Hafizryandin HM
 */
public class Book{
    private String title;
    private int pages;
    private int price;
    
    public Book(String title, int pages, int price){
        this.title = title;
        this.pages = pages;
        this.price = price;
    }
    
    @Override
    public String toString(){
        return title + " (" + pages + " page): " + price + " won"; 
    }
}
