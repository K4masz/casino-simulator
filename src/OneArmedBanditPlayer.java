import java.util.Random;

/**
 * Created by K4masz on 2017-10-21.
 */
public class OneArmedBanditPlayer extends Player {


    OneArmedBanditPlayer(String name) {
        super(name);
    }

    OneArmedBanditPlayer(String name, int cash) {
        super(name, cash);
    }

    @Override
    void play() {
        if (new Random().nextBoolean()) {
            System.out.println("XXX won");
        } else {
            System.out.println("XYZ bust");
        }

    }
}
