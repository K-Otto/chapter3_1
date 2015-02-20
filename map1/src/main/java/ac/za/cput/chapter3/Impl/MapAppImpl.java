package ac.za.cput.chapter3.Impl;

import ac.za.cput.chapter3.MapApp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/02/20.
 */
public class MapAppImpl implements MapApp {
    public Map a = new HashMap();

    @Override
    public Map add1( String index, String obj) {

        a.put(index, obj);
        return(a);
    }
    @Override
    public void add2( String index, String k) {
        mapA.put(index, k);

    }

    @Override
    public String viewMap(String map) {

        return (String) a.get(map);
    }
    @Override
    public String viewMap2(String map) {

        return (String) mapA.get(map);
    }
}
