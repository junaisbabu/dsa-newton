package Oops.Interface;

interface Feature {
    void dialing();
    void messaging();
}

interface Addons {
    void vcalling();
    void internet();
}

class FeaturedPhone implements Feature {
    public void dialing() {
        System.out.println("Featured phone is Dialing...");
    }
    public void messaging() {
        System.out.println("Featured phone is messging...");
    }
}

class SmartPhone implements Addons {
    public void dialing() {
        System.out.println("Featured phone is Dialing...");
    }
    public void messaging() {
        System.out.println("Featured phone is messging...");
    }


    public void vcalling() {
        System.out.println("Smart phone is in Video calling...");
    }

    public void internet() {
        System.out.println("Smart phone is accessing internet...");
    }
}


public class InterfaceExample1 {
    public static void main(String[] args) {
        FeaturedPhone fp = new FeaturedPhone();
        SmartPhone sp = new SmartPhone();

        fp.dialing();
        fp.messaging();

        sp.dialing();
        sp.messaging();
        sp.vcalling();
        sp.internet();

    }
}
