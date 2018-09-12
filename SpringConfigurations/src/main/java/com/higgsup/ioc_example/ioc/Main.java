package com.higgsup.ioc_example.ioc;

public class Main {
    public static void main(String[] args) {
        IocSpellChecker iocSpellChecker = new SpellChecker();
        TextEditor textEditor = new TextEditor(iocSpellChecker);
    }
}
