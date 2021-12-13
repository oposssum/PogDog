package RenderModule;

import javax.swing.*;
import java.awt.*;

public class BottomPanel extends JPanel {
    int w, h;
    public BottomPanel() {
        w = 1080;
        h = 200;
        setBounds(0, 520, w, h);
        setBackground(Color.DARK_GRAY);
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
}
