package ac.za.cput.chapter3;

import java.util.ArrayList;
import java.util.Collection;


/**
 * Created by student on 2015/02/20.
 */
public interface CollectionApp {
    public Collection<Players> stringCollection = new ArrayList<Players>();

    public void add2(int s, String n, String t);

    public String view();
}
