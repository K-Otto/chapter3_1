package ac.za.cput.chapter3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/02/20.
 */
public interface MapApp {

    Map mapA = new HashMap();
    Map add1 (String index, String obj);
    void add2(String index, String k);

    public String viewMap(String Map);
    public String viewMap2(String Map);
}
