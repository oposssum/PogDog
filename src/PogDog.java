import RenderModule.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

//Program entry point. Just some configuration going on
public class PogDog {
    JFrame jf;
    JPanel LJp, BJp, screen;

    PogDog() {
        jf = new JFrame("PogDog");
        jf.setSize(1080, 720);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(null);

        LJp = new JPanel();
        LJp.setBounds(0,0, 200, 520);
        LJp.setBackground(Color.DARK_GRAY);

        BJp = new JPanel();
        BJp.setBounds(0, 520, 1080, 200);
        BJp.setBackground(Color.YELLOW);

        screen = new Screen();
        //scene.setBounds(100, 0, 980, 620);


        new Timer(1, (ActionEvent e) -> {
            screen.repaint();
        }).start();

        jf.setBackground(Color.BLACK);
        jf.add(LJp);
        jf.add(BJp);
        jf.add(screen);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new PogDog();
    }
}
