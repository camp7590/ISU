
import javax.swing.ImageIcon;

abstract public class AbsStore {

    protected String name;
    protected int price;
    protected String catagory;
    protected String facts;
    protected ImageIcon image;

    public AbsStore() {
        price = 0;
       
    }

    public AbsStore(String f, String n, int p, String c, ImageIcon i) {
        facts = f;
        name = n;
        catagory = c;
        price = p;
        image = i;

    }

    final public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCatagory() {
        return catagory;
    }

    public String getFacts() {
        return facts;
    }

    public ImageIcon getImage() {
        return image;
    }
    
        public String toString() {
        String d = "Products\n======\n";
        return d;
    }


}


