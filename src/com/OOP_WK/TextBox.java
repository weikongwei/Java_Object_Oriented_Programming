package com.OOP_WK;
// Class-3 Creating Classes
public class TextBox {
    public String text = ""; // reference type variable needs to be initialized after declaration
                            // otherwise it would be set to null

    public void setText(String text){
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
