package com.lethanh98.ioc_example.ioc;

public class Convert {
    private Type type;

    public Convert(Type type) {
        this.type = type;
    }

    void convert() {
        System.out.println("convert to " + type.toString());
    }
}
