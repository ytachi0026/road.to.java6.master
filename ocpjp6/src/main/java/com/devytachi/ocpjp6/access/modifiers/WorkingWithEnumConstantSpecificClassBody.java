package com.devytachi.ocpjp6.access.modifiers;

enum BiscuitSize {
    OREO("Nestle"),
    MARGARITA("San Jorge") {
        @Override
        public String getType() {
            return "TypeB";
        }

    }, ANIMALITOS("San Jorge");
    private String name;

    BiscuitSize(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return "TypeA";
    }
}

public class WorkingWithEnumConstantSpecificClassBody {
    BiscuitSize size = BiscuitSize.MARGARITA;

    //be careful with constant specific class body, it could be tricky!
    public static void main(String[] args) {
        WorkingWithEnumConstantSpecificClassBody test = new WorkingWithEnumConstantSpecificClassBody();
        System.out.println("Working: " + test.size.getType());
        System.out.println(BiscuitSize.OREO.getType());
    }
}
