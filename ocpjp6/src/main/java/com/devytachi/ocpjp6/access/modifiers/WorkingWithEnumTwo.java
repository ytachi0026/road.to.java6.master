package com.devytachi.ocpjp6.access.modifiers;

//you can also declare a enum like a class, you can add constructors, instance variables, methods, and sth odd like
//constant specific class body

enum TeaSize {
    BIG(10), HUGE(20);
    private int ounces;

    TeaSize(int ounces) {
        this.ounces = ounces;
    }

    public int getOunces() {
        return this.ounces;
    }
};

public class WorkingWithEnumTwo {

}

class Tea {
    TeaSize size;

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.size = TeaSize.BIG;

        System.out.println("Tea size: " + tea.size.getOunces());

        for (TeaSize ts : TeaSize.values()) {
            System.out.println("Tea Size: " + ts + " / " + ts.getOunces());
        }
    }
}