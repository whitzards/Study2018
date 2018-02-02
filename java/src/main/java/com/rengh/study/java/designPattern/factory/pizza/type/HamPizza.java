package com.rengh.study.java.designPattern.factory.pizza.type;

import com.rengh.study.java.designPattern.factory.pizza.base.Pizza;

/**
 * Created by rengh on 18-2-2.
 */

public class HamPizza extends Pizza {
    private String propties;

    public HamPizza() {
        propties = "HamPizza";
    }

    public String getPropties() {
        return propties;
    }
}
