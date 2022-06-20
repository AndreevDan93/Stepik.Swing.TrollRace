import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class TrollFace {
    static Image t1;
    static Image t2;
    static Image t3;
    static Image t4;
    static Image t5;
    static Image t6;
    static Image t7;
    static Image t8;
    static Image t9;
    static Image t10;
    static Image t11;
    static Image t12;
    static Image center;
    static float trollFaceX1 = 0;
    static float trollFaceX2 = 0;
    static float trollFaceX3 = 0;
    static float trollFaceX4 = 0;
    static float trollFaceX5 = 0;
    static float trollFaceX6 = 0;
    static float trollFaceX7 = 0;
    static float trollFaceX8 = 0;
    static float trollFaceX9 = 0;
    static float trollFaceX10 = 0;
    static float trollFaceX11 = 0;
    static float trollFaceX12 = 0;


    static float trollFaceY1 = 0;
    static float trollFaceY2 = 0;
    static float trollFaceY3 = 0;
    static float trollFaceY4 = 0;
    static float trollFaceY5 = 0;
    static float trollFaceY6 = 0;
    static float trollFaceY7 = 0;
    static float trollFaceY8 = 0;
    static float trollFaceY9 = 0;
    static float trollFaceY10 = 0;
    static float trollFaceY11 = 0;
    static float trollFaceY12 = 0;

    static float trollFaceV1 = 3;
    static float trollFaceV2 = 2;
    static float trollFaceV3 = 1;
    static float trollFaceV4 = 3;
    static float trollFaceV5 = 2;
    static float trollFaceV6 = 1;
    static float trollFaceV7 = 3;
    static float trollFaceV8 = 2;
    static float trollFaceV9 = 1;
    static float trollFaceV10 = 3;
    static float trollFaceV11 = 2;
    static float trollFaceV12 = 1;


    static float trollFaceT1 = 0;
    static float trollFaceT2 = 30;
    static float trollFaceT3 = 60;
    static float trollFaceT4 = 90;
    static float trollFaceT5 = 120;
    static float trollFaceT6 = 150;
    static float trollFaceT7 = 180;
    static float trollFaceT8 = 210;
    static float trollFaceT9 = 240;
    static float trollFaceT10 = 270;
    static float trollFaceT11 = 300;
    static float trollFaceT12 = 330;


    static float trollFaceR1 = 150;
    static float trollFaceR2 = 300;
    static float trollFaceR3 = 450;
    static float trollFaceR4 = 150;
    static float trollFaceR5 = 300;
    static float trollFaceR6 = 450;
    static float trollFaceR7 = 150;
    static float trollFaceR8 = 300;
    static float trollFaceR9 = 450;
    static float trollFaceR10 = 150;
    static float trollFaceR11 = 300;
    static float trollFaceR12 = 450;


    static {
        try {
            center = ImageIO.read(Window.class.getResourceAsStream("centr.png"));
            t1 = ImageIO.read(Window.class.getResourceAsStream("1.png"));
            t2 = ImageIO.read(Window.class.getResourceAsStream("2.png"));
            t3 = ImageIO.read(Window.class.getResourceAsStream("3.png"));
            t4 = ImageIO.read(Window.class.getResourceAsStream("4.png"));
            t5 = ImageIO.read(Window.class.getResourceAsStream("5.png"));
            t6 = ImageIO.read(Window.class.getResourceAsStream("6.png"));
            t7 = ImageIO.read(Window.class.getResourceAsStream("1.png"));
            t8 = ImageIO.read(Window.class.getResourceAsStream("2.png"));
            t9 = ImageIO.read(Window.class.getResourceAsStream("3.png"));
            t10 = ImageIO.read(Window.class.getResourceAsStream("4.png"));
            t11 = ImageIO.read(Window.class.getResourceAsStream("5.png"));
            t12 = ImageIO.read(Window.class.getResourceAsStream("6.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
