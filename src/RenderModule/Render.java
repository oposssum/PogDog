package RenderModule;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

import static java.lang.Math.PI;

public class Render {
    static final Path2D shape = new Path2D.Double();
    static final int size = 3;

    static {
        shape.moveTo(0, -size * 2);
        shape.lineTo(-size, size * 2);
        shape.lineTo(size, size * 2);
        shape.closePath();
    }

    public static void draw(Graphics2D g){
        AffineTransform save = g.getTransform();

        g.translate(100, 100);
        g.setColor(Color.white);
        g.fill(shape);
        g.setColor(Color.black);
        g.draw(shape);

        g.setTransform(save);
    }
}
