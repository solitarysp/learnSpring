package com.higgsup.ioc_example.not_ioc;

public class Convert {
    private Type type;

    public Convert() {
        type = new Lating();
    }

    void convert() {
        System.out.println("convert to " + type);
    }
}
