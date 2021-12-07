package RenderModule;

import SimulationModule.Entities;
import SimulationModule.TestEntity;
import SimulationModule.Vec;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class outputField extends JPanel {
    int w, h;

    Entities entities;

    public outputField() {
        w = 880;
        h = 520;
        setBounds(200, 0, w, h);

        entities = new Entities();
        entities.testSpawn();
    }

    public void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D) gg;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        entities.run(g);
    }


}
