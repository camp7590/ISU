
import javax.swing.ImageIcon;

public class Dairy extends AbsStore {

    public Dairy() {
        super();

    }

    public Dairy(String f, String n, int p, String c, ImageIcon i) {
      super();

    }

    public String toString() {
        String d = "Dairy Products\n======\n";
        d += "\nMilk:  ";
        d += "\nYogurt: ";
        d += "\nCheese: ";
        d += "\nButter: ";
        return d;
    }

}
