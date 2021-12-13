import RenderModule.BottomPanel;
import RenderModule.LeftPanel;
import RenderModule.outputField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

//Program entry point. Just some configuration going on
public class PogDog {
    JFrame jf;
    JPanel LJp, BJp, OF;

    PogDog() {
        jf = new JFrame("PogDog");
        jf.setSize(1080, 720);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setBackground(Color.MAGENTA);

        LJp = new LeftPanel() ;

        BJp = new BottomPanel();

        OF = new outputField();

        new Timer(1, (ActionEvent e) ->
                OF.repaint()
        ).start();

        jf.setBackground(Color.BLACK);
        jf.add(LJp);
        jf.add(BJp);
        jf.add(OF);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new PogDog();
    }
}
