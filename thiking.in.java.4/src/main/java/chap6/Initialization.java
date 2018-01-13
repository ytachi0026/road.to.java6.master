package chap6;

public class Initialization {
    static YtaStatic yta = new YtaStatic();
    YtaloMon2 ytalomon = new YtaloMon2();

    public static void main(String[] args) {
//		Initialization y = new Initialization();
    }
}

class YtaloMon2 {
    public YtaloMon2() {
        System.out.println("Ytalomon");
    }
}

class YtaStatic {
    public YtaStatic() {
        System.out.println("YtaStatic");
    }
}