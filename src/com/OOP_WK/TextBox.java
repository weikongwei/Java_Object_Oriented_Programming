// Section 2 - Classes

package com.OOP_WK;
// Class-3 Creating Classes
public class TextBox extends UIControl {
    public String text = ""; // reference type variable needs to be initialized after declaration
                            // otherwise it would be set to null

//    public TextBox() {
//        super (true);
//        System.out.println("TextBox");
//    }


    @Override
    public void render() {
        System.out.println("Render TextBox");;
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
