package com.higgsup.ioc_example.not_ioc;

public class TextEditor {
    private SpellChecker checker;

    public TextEditor() {
        // khai báo thế này class TextEditor trực tiếp phục thuộc vào SpellChecker
        this.checker = new SpellChecker();
    }
}
