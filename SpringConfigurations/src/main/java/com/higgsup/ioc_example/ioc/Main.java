package com.higgsup.ioc_example.ioc;

public class Main {
    public static void main(String[] args) {
        Convert convertLating = new Convert(new Lating());
        convertLating.convert();

        Convert convertUTF8 = new Convert(new UTF8());
        convertUTF8.convert();
    }
}
