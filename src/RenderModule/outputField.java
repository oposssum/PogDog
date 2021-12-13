package RenderModule;

import SimulationModule.Entities;
import SimulationModule.Vec;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class outputField extends JPanel {
    int w, h;

    Entities entities;

    long frameDelta = 0;

    public outputField() {
        w = 980;
        h = 520;
        setBounds(100, 0, w, h);

        entities = new Entities();
        entities.testSpawn();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                Entities.add(new Vec(e.getX(), e.getY()));
            }
        });
    }



    public void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D) gg;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        long start = System.nanoTime();
        entities.run(g, frameDelta);
        frameDelta = System.nanoTime() - start; // Delta time in ms
        System.out.println(frameDelta);
    }


}
