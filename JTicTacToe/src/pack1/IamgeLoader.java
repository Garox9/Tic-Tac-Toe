package pack1;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class IamgeLoader {

    static Image imgX, imgO;

    public IamgeLoader() {
        try {
            imgX = ImageIO.read(new File("res/x.png"));
            imgO = ImageIO.read(new File("res/o.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
