package com.higgsup.ioc_example.ioc;

public class TextEditor {
    private IocSpellChecker checker;

    public TextEditor(IocSpellChecker checker) {
        this.checker = checker;
    }
}
