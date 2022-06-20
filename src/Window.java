

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Window extends JFrame {

    static Window window = new Window();
    static long frameTime = System.nanoTime();


    public static void main(String[] args) throws IOException {

        initFrame();
        GameField gameField = new GameField();
        window.add(gameField);
        window.setVisible(true);


    }


    static void initFrame() {
        window.pack();
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setBounds(0, 0, 1000, 1000);


    }

    private static class GameField extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);


            Window.move(g);
            repaint();


        }
    }

    private static void move(Graphics g) {

        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - frameTime) * 0.0000001f;
        frameTime = currentTime;
        g.drawImage(TrollFace.center, 435, 435, null);


        TrollFace.trollFaceT1 = TrollFace.trollFaceT1 + deltaTime * TrollFace.trollFaceV1;
        TrollFace.trollFaceX1 = (float) (TrollFace.trollFaceR1 * Math.cos(Math.toRadians(TrollFace.trollFaceT1)) + 435);
        TrollFace.trollFaceY1 = (float) (TrollFace.trollFaceR1 * Math.sin(Math.toRadians(TrollFace.trollFaceT1)) + 435);

        TrollFace.trollFaceT2 = TrollFace.trollFaceT2 - deltaTime * TrollFace.trollFaceV2;
        TrollFace.trollFaceX2 = (float) (TrollFace.trollFaceR2 * Math.cos(Math.toRadians(TrollFace.trollFaceT2)) + 435);
        TrollFace.trollFaceY2 = (float) (TrollFace.trollFaceR2 * Math.sin(Math.toRadians(TrollFace.trollFaceT2)) + 435);

        TrollFace.trollFaceT3 = TrollFace.trollFaceT3 + deltaTime * TrollFace.trollFaceV3;
        TrollFace.trollFaceX3 = (float) (TrollFace.trollFaceR3 * Math.cos(Math.toRadians(TrollFace.trollFaceT3)) + 435);
        TrollFace.trollFaceY3 = (float) (TrollFace.trollFaceR3 * Math.sin(Math.toRadians(TrollFace.trollFaceT3)) + 435);

        TrollFace.trollFaceT4 = TrollFace.trollFaceT4 - deltaTime * TrollFace.trollFaceV4;
        TrollFace.trollFaceX4 = (float) (TrollFace.trollFaceR4 * Math.cos(Math.toRadians(TrollFace.trollFaceT4)) + 435);
        TrollFace.trollFaceY4 = (float) (TrollFace.trollFaceR4 * Math.sin(Math.toRadians(TrollFace.trollFaceT4)) + 435);

        TrollFace.trollFaceT5 = TrollFace.trollFaceT5 + deltaTime * TrollFace.trollFaceV5;
        TrollFace.trollFaceX5 = (float) (TrollFace.trollFaceR5 * Math.cos(Math.toRadians(TrollFace.trollFaceT5)) + 435);
        TrollFace.trollFaceY5 = (float) (TrollFace.trollFaceR5 * Math.sin(Math.toRadians(TrollFace.trollFaceT5)) + 435);

        TrollFace.trollFaceT6 = TrollFace.trollFaceT6 - deltaTime * TrollFace.trollFaceV6;
        TrollFace.trollFaceX6 = (float) (TrollFace.trollFaceR6 * Math.cos(Math.toRadians(TrollFace.trollFaceT6)) + 435);
        TrollFace.trollFaceY6 = (float) (TrollFace.trollFaceR6 * Math.sin(Math.toRadians(TrollFace.trollFaceT6)) + 435);

        TrollFace.trollFaceT7 = TrollFace.trollFaceT7 + deltaTime * TrollFace.trollFaceV7;
        TrollFace.trollFaceX7 = (float) (TrollFace.trollFaceR7 * Math.cos(Math.toRadians(TrollFace.trollFaceT7)) + 435);
        TrollFace.trollFaceY7 = (float) (TrollFace.trollFaceR7 * Math.sin(Math.toRadians(TrollFace.trollFaceT7)) + 435);

        TrollFace.trollFaceT8 = TrollFace.trollFaceT8 - deltaTime * TrollFace.trollFaceV8;
        TrollFace.trollFaceX8 = (float) (TrollFace.trollFaceR8 * Math.cos(Math.toRadians(TrollFace.trollFaceT8)) + 435);
        TrollFace.trollFaceY8 = (float) (TrollFace.trollFaceR8 * Math.sin(Math.toRadians(TrollFace.trollFaceT8)) + 435);

        TrollFace.trollFaceT9 = TrollFace.trollFaceT9 + deltaTime * TrollFace.trollFaceV9;
        TrollFace.trollFaceX9 = (float) (TrollFace.trollFaceR9 * Math.cos(Math.toRadians(TrollFace.trollFaceT9)) + 435);
        TrollFace.trollFaceY9 = (float) (TrollFace.trollFaceR9 * Math.sin(Math.toRadians(TrollFace.trollFaceT9)) + 435);

        TrollFace.trollFaceT10 = TrollFace.trollFaceT10 - deltaTime * TrollFace.trollFaceV10;
        TrollFace.trollFaceX10 = (float) (TrollFace.trollFaceR10 * Math.cos(Math.toRadians(TrollFace.trollFaceT10)) + 435);
        TrollFace.trollFaceY10 = (float) (TrollFace.trollFaceR10 * Math.sin(Math.toRadians(TrollFace.trollFaceT10)) + 435);

        TrollFace.trollFaceT11 = TrollFace.trollFaceT11 + deltaTime * TrollFace.trollFaceV11;
        TrollFace.trollFaceX11 = (float) (TrollFace.trollFaceR11 * Math.cos(Math.toRadians(TrollFace.trollFaceT11)) + 435);
        TrollFace.trollFaceY11 = (float) (TrollFace.trollFaceR11 * Math.sin(Math.toRadians(TrollFace.trollFaceT11)) + 435);

        TrollFace.trollFaceT12 = TrollFace.trollFaceT12 - deltaTime * TrollFace.trollFaceV12;
        TrollFace.trollFaceX12 = (float) (TrollFace.trollFaceR12 * Math.cos(Math.toRadians(TrollFace.trollFaceT12)) + 435);
        TrollFace.trollFaceY12 = (float) (TrollFace.trollFaceR12 * Math.sin(Math.toRadians(TrollFace.trollFaceT12)) + 435);


        g.drawImage(TrollFace.t1, (int) TrollFace.trollFaceX1, (int) TrollFace.trollFaceY1, null);
        g.drawImage(TrollFace.t2, (int) TrollFace.trollFaceX2, (int) TrollFace.trollFaceY2, null);
        g.drawImage(TrollFace.t3, (int) TrollFace.trollFaceX3, (int) TrollFace.trollFaceY3, null);
        g.drawImage(TrollFace.t4, (int) TrollFace.trollFaceX4, (int) TrollFace.trollFaceY4, null);
        g.drawImage(TrollFace.t5, (int) TrollFace.trollFaceX5, (int) TrollFace.trollFaceY5, null);
        g.drawImage(TrollFace.t6, (int) TrollFace.trollFaceX6, (int) TrollFace.trollFaceY6, null);
        g.drawImage(TrollFace.t7, (int) TrollFace.trollFaceX7, (int) TrollFace.trollFaceY7, null);
        g.drawImage(TrollFace.t8, (int) TrollFace.trollFaceX8, (int) TrollFace.trollFaceY8, null);
        g.drawImage(TrollFace.t9, (int) TrollFace.trollFaceX9, (int) TrollFace.trollFaceY9, null);
        g.drawImage(TrollFace.t10, (int) TrollFace.trollFaceX10, (int) TrollFace.trollFaceY10, null);
        g.drawImage(TrollFace.t11, (int) TrollFace.trollFaceX11, (int) TrollFace.trollFaceY11, null);
        g.drawImage(TrollFace.t12, (int) TrollFace.trollFaceX12, (int) TrollFace.trollFaceY12, null);


        TrollFace.trollFaceX1 = TrollFace.trollFaceX1 + TrollFace.trollFaceV1 * deltaTime;
        TrollFace.trollFaceY1 = 0;

        TrollFace.trollFaceX2 = TrollFace.trollFaceX2 + TrollFace.trollFaceV2 * deltaTime;
        TrollFace.trollFaceY2 = 150;

        TrollFace.trollFaceX3 = TrollFace.trollFaceX3 + TrollFace.trollFaceV3 * deltaTime;
        TrollFace.trollFaceY3 = 250;

        TrollFace.trollFaceX5 = TrollFace.trollFaceX5 + TrollFace.trollFaceV5 * deltaTime;
        TrollFace.trollFaceY5 = 600;

        TrollFace.trollFaceX6 = TrollFace.trollFaceX6 + TrollFace.trollFaceV6 * deltaTime;
        TrollFace.trollFaceY6 = 750;

        TrollFace.trollFaceX7 = TrollFace.trollFaceX7 - TrollFace.trollFaceV7 * deltaTime;
        TrollFace.trollFaceY7 = 0;

        TrollFace.trollFaceX8 = TrollFace.trollFaceX8 - TrollFace.trollFaceV8 * deltaTime;
        TrollFace.trollFaceY8 = 150;

        TrollFace.trollFaceX9 = TrollFace.trollFaceX9 - TrollFace.trollFaceV9 * deltaTime;
        TrollFace.trollFaceY9 = 250;

        TrollFace.trollFaceX11 = TrollFace.trollFaceX11 - TrollFace.trollFaceV11 * deltaTime;
        TrollFace.trollFaceY11 = 600;

        TrollFace.trollFaceX12 = TrollFace.trollFaceX12 - TrollFace.trollFaceV12 * deltaTime;
        TrollFace.trollFaceY12 = 750;


        g.drawImage(TrollFace.t1, (int) TrollFace.trollFaceX1, (int) TrollFace.trollFaceY1, null);
        g.drawImage(TrollFace.t2, (int) TrollFace.trollFaceX2, (int) TrollFace.trollFaceY2, null);
        g.drawImage(TrollFace.t3, (int) TrollFace.trollFaceX3, (int) TrollFace.trollFaceY3, null);
        g.drawImage(TrollFace.t4, (int) TrollFace.trollFaceX4, (int) TrollFace.trollFaceY4, null);
        g.drawImage(TrollFace.t5, (int) TrollFace.trollFaceX5, (int) TrollFace.trollFaceY5, null);
        g.drawImage(TrollFace.t6, (int) TrollFace.trollFaceX6, (int) TrollFace.trollFaceY6, null);
        g.drawImage(TrollFace.t7, (int) TrollFace.trollFaceX7, (int) TrollFace.trollFaceY7, null);
        g.drawImage(TrollFace.t8, (int) TrollFace.trollFaceX8, (int) TrollFace.trollFaceY8, null);
        g.drawImage(TrollFace.t9, (int) TrollFace.trollFaceX9, (int) TrollFace.trollFaceY9, null);
        g.drawImage(TrollFace.t10, (int) TrollFace.trollFaceX10, (int) TrollFace.trollFaceY10, null);
        g.drawImage(TrollFace.t11, (int) TrollFace.trollFaceX11, (int) TrollFace.trollFaceY11, null);
        g.drawImage(TrollFace.t12, (int) TrollFace.trollFaceX12, (int) TrollFace.trollFaceY12, null);


    }


}