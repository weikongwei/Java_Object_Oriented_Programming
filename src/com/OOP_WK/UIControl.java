package com.OOP_WK;

public abstract class UIControl {
    // Inheritance - class 10 abstract class and methods
    // abstract class is a conceptual class or a virtual class which cannot instantiate and instance.

    private boolean isEnabled = true;

//    public UIControl(boolean isEnabled) {
//        System.out.println("UIControl");
//        this.isEnabled = isEnabled;
//    }

    // final method cannot be override
    public final void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    // getter of variable "isEnabled"
    public boolean isEnabled() {
        return isEnabled;
    }

    // Inheritance - class 10 abstract class and methods
    // abstract methods is always empty and it pushes sub-clases to complete the implementation
    // If we mark a method as abstract, we should mark the class as abstract as well.
    public abstract void render();

}
