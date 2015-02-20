package ac.za.cput.chapter3.Impl;

import ac.za.cput.chapter3.SetApp;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2015/02/20.
 */
public class SetAppImpl implements SetApp {
    public Set a = new HashSet<String>();

    @Override
    public Set add1( String obj) {

        a.add( obj);
        return(a);
    }
    @Override
    public void add2(  String k) {
        setA.add(k);

    }
    @Override
    public String view() {
        return a.toString();
    }
}
