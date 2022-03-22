package OwnEffect;

interface Mi14Advantages {
    void memory();
    void noiseless();
    void buildQuality();
    void display();
    void battery();
}

interface Mi14Disadvantages {
    void camera();
    void keyboard();
    void trackPad();
    void heating();
}

class MiNotebook14Spec implements Mi14Advantages, Mi14Disadvantages {

    // ADVANTAGES

    public void memory() {
        System.out.println("It has 512 GB SSD and 8 Gb RAM");
    }

    public void noiseless() {
        System.out.println("It can reduce the noise");
    }

    public void buildQuality() {
        System.out.println("It has a adorable disign and Premium build quality");
    }

    public void display() {
        System.out.println("It has a decent display for normal uses (not for designing)");
    }

    public void battery() {
        System.out.println("It's battery backup 10 hours");
    }


    // DISADVANTAGES

    public void camera() {
        System.out.println("There is no web camera");
    }

    public void keyboard() {
        System.out.println("Keyboard is not good that much for typing");
    }

    public void trackPad() {
        System.out.println("Trackpad is not good that much");
    }

    public void heating() {
        System.out.println("It heats sometime When i put on charge while using");
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        MiNotebook14Spec mi = new MiNotebook14Spec();

        // ADVANTAGES

        mi.memory();
        mi.noiseless();
        mi.buildQuality();
        mi.display();
        mi.battery();

        // DISADVANTAGES

        mi.camera();
        mi.keyboard();
        mi.trackPad();
        mi.heating();
    }
}
