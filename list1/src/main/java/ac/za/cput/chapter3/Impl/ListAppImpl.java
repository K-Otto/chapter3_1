package ac.za.cput.chapter3.Impl;

import ac.za.cput.chapter3.ListApp;


import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/19.
 */
public class ListAppImpl implements ListApp {


    public List a = new ArrayList();

    @Override
    public List add1( int index, String obj) {

        a.add( index,obj);
       return(a);
    }
}
