package ac.za.cput.chapter3.Impl;

import ac.za.cput.chapter3.*;


import java.util.List;

/**
 * Created by student on 2015/02/20.
 */
public class ComboAppImpl implements ComboApp {
    private ListApp listAddModule = new ListAppImpl();
    private SetApp setAddModule = new SetAppImpl();
    private MapApp mapAddModule = new MapAppImpl();

    @Override
    public void list1(int a, String b) {
        listAddModule.add1(a, b);



    }
    @Override
    public void set11(String a) {
        setAddModule.add2(a);
    }
    @Override
    public void map11(String a, String b) {
        mapAddModule.add2(a, b);
    }
    @Override
    public String views() {
        return listAddModule.view2();
    }


}

