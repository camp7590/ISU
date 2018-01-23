
import javax.swing.ImageIcon;

abstract public class AbsStore {

    protected String name;
    protected int price;
    protected int buy;
    protected int sell;
    protected String facts;
    protected ImageIcon image;

    String d[] = {"Cheese", "Milk", "Yogurt", "Butter"};
    String m[] = {"Fish", "Chicken", "Pork", "Beef"};
    String f[] = {"Apple", "Banana", "Strawberry", "Grapes"};

    public AbsStore() {

    }

    public AbsStore(boolean b, String n, int p, String c, ImageIcon i) {

    }

    public String dairy() {
        for (int i = 0; i < 3; i++) {
            System.out.println(d[i]);
        }
        return null;
    }

    public String Meat() {
        for (int i = 0; i < 3; i++) {
            System.out.println(m[i]);
        }
        return null;
    }

    public String Fruits() {
        for (int i = 0; i < 3; i++) {
            System.out.println(f[i]);
        }
        return null;
    }

    public ImageIcon getImage() {
        return image;
    }

}
