package ac.za.cput.chapter3.Impl;

import ac.za.cput.chapter3.CollectionApp;
import ac.za.cput.chapter3.Players;



/**
 * Created by student on 2015/02/20.
 */
public class CollectionAppsImpl implements CollectionApp {


    public void add2(int s, String n, String t) {
        stringCollection.add( new Players(s, n, t));
    }

    public String view() {

        return  stringCollection.toString();}
}


