package chap8;

public class ReusingClassHelp {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReusingClassHelp() {
        super();
    }

    protected void printName() {
        System.out.println("Name");
    }
}
